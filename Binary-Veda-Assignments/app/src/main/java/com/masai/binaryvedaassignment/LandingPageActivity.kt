package com.masai.binaryvedaassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class LandingPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRegester.setOnClickListener {
            val intent = Intent(this,ProfilePageActivity::class.java)
            startActivity(intent)
        }

    }
}