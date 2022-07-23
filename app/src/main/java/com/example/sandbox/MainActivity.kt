package com.example.sandbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_btn.setOnClickListener(){
            Toast.makeText(this, "Loged In", Toast.LENGTH_SHORT).show()
            val Intent=Intent(this, login::class.java)
            startActivity(Intent)
        }
    }
}