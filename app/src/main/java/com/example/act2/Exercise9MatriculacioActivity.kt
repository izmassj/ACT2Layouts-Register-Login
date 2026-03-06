package com.example.act2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Exercise9MatriculacioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise9_matriculacio)

        val cbMates = findViewById<CheckBox>(R.id.cbMates)
        val cbCatalan = findViewById<CheckBox>(R.id.cbCatala)
        val cbProgramacio = findViewById<CheckBox>(R.id.cbProgramacio)
        val cbAngles = findViewById<CheckBox>(R.id.cbAngles)

        val rgTorn = findViewById<RadioGroup>(R.id.rgTorn)
        val rbMati = findViewById<RadioButton>(R.id.rbMati)
        val rbTarda = findViewById<RadioButton>(R.id.rbTarda)

        val btnConfirmar = findViewById<Button>(R.id.btnMatricular)

        btnConfirmar.setOnClickListener {
            val materies = mutableListOf<String>()
            if (cbMates.isChecked) materies.add("Matemàtiques")
            if (cbCatalan.isChecked) materies.add("Català")
            if (cbProgramacio.isChecked) materies.add("Programació")
            if (cbAngles.isChecked) materies.add("Anglès")

            val torn = when (rgTorn.checkedRadioButtonId) {
                rbMati.id -> "Matí"
                rbTarda.id -> "Tarda"
                else -> "No seleccionat"
            }

            val missatge = "Matriculació feta\nMatèries: ${
                if (materies.isEmpty()) "Cap" else materies.joinToString(", ")
            }\nTorn: $torn"

            Toast.makeText(this, missatge, Toast.LENGTH_LONG).show()
        }
    }
}