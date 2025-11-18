package com.example.assignment


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class AddZoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_zone)

        val etName = findViewById<TextInputEditText>(R.id.etZoneName)
        val etRadius = findViewById<TextInputEditText>(R.id.etRadius)
        findViewById<MaterialButton>(R.id.btnPickLoc).setOnClickListener {
            // placeholder - will request GPS in full version
            Toast.makeText(this, "Pick location (demo)", Toast.LENGTH_SHORT).show()
        }
        findViewById<MaterialButton>(R.id.btnSave).setOnClickListener {
            val name = etName?.text?.toString().orEmpty()
            val rad = etRadius?.text?.toString().orEmpty()
            if (name.isEmpty() || rad.isEmpty()) {
                Toast.makeText(this, "Please fill name & radius", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Saved: $name ($rad m)", Toast.LENGTH_SHORT).show()
                finish() // demo: go back to list
            }
        }
    }
}
