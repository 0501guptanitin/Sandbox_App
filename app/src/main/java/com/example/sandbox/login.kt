package com.example.sandbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signin_submit.setOnClickListener {
            val email=findViewById<EditText>(R.id.signin_email).text.toString()
            val password=findViewById<EditText>(R.id.signin_password).text.toString()
            if(email.isEmpty()){
                signin_email.error="Email required"
                signin_email.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()){
                signin_password.error="Password Required"
                signin_password.requestFocus()
                return@setOnClickListener
            }
            val Intent=Intent(this, HomeActivity::class.java)
            startActivity(Intent)
        }
        signin_back.setOnClickListener{
            val intent1=Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }
    }

//    fun signin(view: View){
//        val email=findViewById<EditText>(R.id.signin_email).text.toString()
//        val password=findViewById<EditText>(R.id.signin_password).text.toString()
//        if(email== "nitin@gmail.com" && password=="1234") {
//
//            val intent = Intent(this, HomeActivity::class.java)
//            startActivity(intent)
//                Toast.makeText(this, "Loged in Successfully", Toast.LENGTH_SHORT).show()
//        }
//        else {
//
//
//                Toast.makeText(this, "Sorry incorrect credential", Toast.LENGTH_SHORT).show()
//        }
//    }
}