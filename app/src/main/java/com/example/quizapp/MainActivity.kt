package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.quizapp.ui.QuestionsActivity
import com.example.quizapp.utils.Constants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.button_start)
        val editTextName: EditText = findViewById(R.id.name)
        val editTextRegno: EditText = findViewById(R.id.regno)

        startButton.setOnClickListener {
            if (!editTextName.text.isEmpty() && !editTextRegno.text.isEmpty()) {
                Intent(this@MainActivity, QuestionsActivity::class.java).also {
                    it.putExtra(Constants.USER_NAME, editTextName.text.toString())
                    startActivity(it)
                    finish()
                }
            } else {
                Toast.makeText(this@MainActivity, "Please enter your details", Toast.LENGTH_LONG).show()
            }
        }
    }
}