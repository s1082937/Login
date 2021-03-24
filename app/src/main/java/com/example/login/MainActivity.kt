package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = intent.extras?.getString("user")
        var tv= findViewById<TextView>(R.id.textView2)
        tv.setText("Welcome "+value)
    }
}