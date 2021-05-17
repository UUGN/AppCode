package com.example.checkme.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.checkme.R

class LoginActivity : AppCompatActivity(){
    private val appCompatButton_Login : AppCompatButton by lazy { findViewById(R.id.appCompatButton_Login) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        appCompatButton_Login.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }

}