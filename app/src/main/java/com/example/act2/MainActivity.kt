package com.example.act2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnEx6).setOnClickListener {
            startActivity(Intent(this, Exercise6Activity::class.java))
        }

        findViewById<Button>(R.id.btnEx7).setOnClickListener {
            startActivity(Intent(this, Exercise7MenuActivity::class.java))
        }

        findViewById<Button>(R.id.btnEx8).setOnClickListener {
            startActivity(Intent(this, Exercise8LoginActivity::class.java))
        }

        findViewById<Button>(R.id.btnEx9).setOnClickListener {
            startActivity(Intent(this, Exercise9MatriculacioActivity::class.java))
        }

        findViewById<Button>(R.id.btnEx10).setOnClickListener {
            startActivity(Intent(this, Exercise10MenuActivity::class.java))
        }
    }
}