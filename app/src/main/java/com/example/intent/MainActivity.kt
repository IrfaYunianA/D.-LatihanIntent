package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var Nim : EditText
    private lateinit var Nama : EditText
    private lateinit var Nilai : EditText
    private lateinit var Submit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nim = findViewById(R.id.id_nim)
        Nama = findViewById(R.id.id_nama)
        Nilai = findViewById(R.id.id_nilai)
        Submit = findViewById(R.id.id_submit)

        Submit.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("Nim", Nim.text.toString())
            bundle.putString("Nama", Nama.text.toString())
            bundle.putString("Nilai", Nilai.text.toString())
            val intent = Intent(this, ActivityKedua::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}