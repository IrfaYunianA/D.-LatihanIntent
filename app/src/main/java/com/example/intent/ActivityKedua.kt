package com.example.intent


import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.NumberFormatException

class ActivityKedua : AppCompatActivity(){
    private lateinit var tv_Nim : TextView
    private lateinit var tv_Nama : TextView
    private lateinit var tv_Nilai : TextView
    private lateinit var tv_Ket : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        tv_Nim = findViewById(R.id.tv_nim)
        tv_Nama = findViewById(R.id.tv_nama)
        tv_Nilai = findViewById(R.id.tv_nilai)
        tv_Ket = findViewById(R.id.tv_ket)

        val bundle = intent.extras
        if (bundle != null) {
            tv_Nim.setText(": "+bundle.getString( "Nim"))
            tv_Nama.setText(": "+bundle.getString("Nama"))
            tv_Nilai.setText(": "+bundle.getString("Nilai"))

            val ket = bundle.getString("tv_Nilai")
            val ketIn = toInt(ket.toString())
            if (ketIn?: 0>=80){
                tv_Ket.setText(": A")
            }else if (ketIn?: 0>=60){
                tv_Ket.setText(": B")
            }else if (ketIn?: 0>=40){
                tv_Ket.setText(": C")
            }else if (ketIn?: 0>=20){
                tv_Ket.setText(": D")
            }else if (ketIn?: 0>=0){
                tv_Ket.setText(": E")
            }
        }
    }
}
private fun toInt(nli: String) : Int?{
    return try{
        nli.toInt()
        }catch (e: NumberFormatException){
        null
    }
}