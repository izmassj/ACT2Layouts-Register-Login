package com.example.act2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Exercise8LoginActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "EXERCICI8_LOGIN"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise8_login)

        val etUsuari = findViewById<EditText>(R.id.etLoginUsuari)
        val etPassword = findViewById<EditText>(R.id.etLoginPassword)
        val btnConfirmar = findViewById<Button>(R.id.btnLoginConfirmar)

        btnConfirmar.setOnClickListener {
            val usuari = etUsuari.text.toString()
            val contrasenya = etPassword.text.toString()

            Toast.makeText(
                this,
                "Usuari: $usuari | Password: $contrasenya",
                Toast.LENGTH_SHORT
            ).show()

            Log.d(TAG, "Usuari introduït: $usuari")
            Log.d(TAG, "Contrasenya introduïda: $contrasenya")
        }
    }
}