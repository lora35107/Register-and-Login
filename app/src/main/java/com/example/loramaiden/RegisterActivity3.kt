package com.example.loramaiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity3 : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var telephone: EditText
    private lateinit var email: EditText
    private lateinit var passcode: EditText
    private lateinit var register: Button
    private lateinit var login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register3)
        name = findViewById(R.id.edtname)
        telephone = findViewById(R.id.edttelephone)
        email = findViewById(R.id.edtemail)
        passcode = findViewById(R.id.edtpasscode)
        login = findViewById(R.id.btnlogin)
        register = findViewById(R.id.btnreg)

    }
}