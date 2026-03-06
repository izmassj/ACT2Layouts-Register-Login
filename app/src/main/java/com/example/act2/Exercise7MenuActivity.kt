package com.example.act2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.act2.RegisterLinearActivity

class Exercise7MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise7_menu)

        findViewById<Button>(R.id.btnRegLinear).setOnClickListener {
            startActivity(Intent(this, RegisterLinearActivity::class.java))
        }

        findViewById<Button>(R.id.btnRegRelative).setOnClickListener {
            startActivity(Intent(this, RegisterRelativeActivity::class.java))
        }

        findViewById<Button>(R.id.btnRegConstraint).setOnClickListener {
            startActivity(Intent(this, RegisterConstraintActivity::class.java))
        }
    }
}