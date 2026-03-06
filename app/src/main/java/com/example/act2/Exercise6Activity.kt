package com.example.act2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Exercise6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise6)

        val etText = findViewById<EditText>(R.id.etEx6Text)
        val btnMostrar = findViewById<Button>(R.id.btnEx6Mostrar)

        btnMostrar.setOnClickListener {
            val text = etText.text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}