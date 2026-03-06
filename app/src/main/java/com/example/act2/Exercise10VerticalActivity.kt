package com.example.act2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Exercise10VerticalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise10_vertical)

        findViewById<Button>(R.id.btnGoHorizontalFromVertical).setOnClickListener {
            startActivity(Intent(this, Exercise10HorizontalActivity::class.java))
        }

        findViewById<Button>(R.id.btnBackEx10MenuFromVertical).setOnClickListener {
            finish()
        }
    }
}