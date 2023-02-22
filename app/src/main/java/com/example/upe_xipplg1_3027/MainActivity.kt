 package com.example.upe_xipplg1_3027

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)
        btn.setOnClickListener {
            val intent = Intent(this, WisataActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val sahrul = Intent(this, KulinerActivity::class.java)
            startActivity(sahrul)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, HotelActivity::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val sahrul = Intent(this, GoogleMaps::class.java)
            startActivity(sahrul)
        }
    }
}