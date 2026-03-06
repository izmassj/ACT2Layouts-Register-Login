package com.example.act2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Exercise10MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise10_menu)

        findViewById<Button>(R.id.btnEx10Horizontal).setOnClickListener {
            startActivity(Intent(this, Exercise10HorizontalActivity::class.java))
        }

        findViewById<Button>(R.id.btnEx10Vertical).setOnClickListener {
            startActivity(Intent(this, Exercise10VerticalActivity::class.java))
        }
    }
}