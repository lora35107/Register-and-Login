package com.example.loramaiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RelativeLayoutActivity : AppCompatActivity() {
    private lateinit var email:EditText
    private lateinit var password: EditText
    private lateinit var loginbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        email = findViewById(R.id.edt_email)
        password = findViewById(R.id.edt_passcode)
        loginbtn = findViewById(R.id.btn_login)

        loginbtn.setOnClickListener {
            Toast.makeText(this, "Trying to log in", Toast.LENGTH_SHORT).show()
        }
    }
}