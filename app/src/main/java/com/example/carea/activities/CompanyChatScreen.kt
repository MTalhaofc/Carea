package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivityCompanyChatScreenBinding

class CompanyChatScreen : AppCompatActivity() {
    private lateinit var binding: ActivityCompanyChatScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompanyChatScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgBack.setOnClickListener {
            val intent = Intent(this, Makeoffer::class.java)
            startActivity(intent)
        }

    }
}