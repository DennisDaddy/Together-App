package com.dennis.together

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val imageOpenActivity : ImageView = findViewById(R.id.back_arrow)
        imageOpenActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnRegisterActivity : Button = findViewById(R.id.btn_register)
        btnRegisterActivity.setOnClickListener {
            val intent = Intent(this, ConfirmationActivity::class.java)
            startActivity(intent)
        }
    }
}
