package com.example.act2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Exercise10HorizontalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise10_horizontal)

        findViewById<Button>(R.id.btnGoVerticalFromHorizontal).setOnClickListener {
            startActivity(Intent(this, Exercise10VerticalActivity::class.java))
        }

        findViewById<Button>(R.id.btnBackEx10MenuFromHorizontal).setOnClickListener {
            finish()
        }
    }
}