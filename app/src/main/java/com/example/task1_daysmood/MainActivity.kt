package com.example.task1_daysmood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn_happy: Button
    lateinit var btn_sad: Button
    lateinit var btn_mad: Button
    lateinit var etName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_happy = findViewById(R.id.btn_Happy)
        etName = findViewById(R.id.et_name)
        btn_mad = findViewById(R.id.btn_Mad)
        btn_sad = findViewById(R.id.btn_Sad)

        btn_happy.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Harap isi nama terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this,
                "Hi, " + etName.text + "." + " you are happy today! :D",
                Toast.LENGTH_SHORT
            ).show()
        }
        btn_mad.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Harap isi nama terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Hi, " + etName.text + "." + " you are mad today! :C", Toast.LENGTH_SHORT)
                .show()
        }
        btn_sad.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Harap isi nama terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Hi, " + etName.text + "." + " you are sad today! :(", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
