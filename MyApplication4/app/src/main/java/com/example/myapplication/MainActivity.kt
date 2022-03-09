package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_contato.setOnClickListener {
            val intent = Intent(this, DetalheContatos::class.java)
            startActivity(intent)
        }
        button_servicos.setOnClickListener {
            val intent = Intent(this, DetalheServicos::class.java)
            startActivity(intent)
        }
        button_empresa.setOnClickListener {
            val intent = Intent(this, DetalheEmpresas::class.java)
            startActivity(intent)
        }
        button_cliente.setOnClickListener {
            val intent = Intent(this, DetalheClientesActivities::class.java)
            startActivity(intent)
        }
    }

}