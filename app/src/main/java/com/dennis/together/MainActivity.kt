package com.dennis.together

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val btnOpenActivity : Button = findViewById(R.id.btn_continue)
         btnOpenActivity.setOnClickListener {
             val intent = Intent(this, RegistrationActivity::class.java)
             startActivity(intent)
         }
    }
}
