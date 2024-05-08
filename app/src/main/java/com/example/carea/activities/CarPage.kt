package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivityCarPageBinding

class CarPage : AppCompatActivity() {
    private lateinit var binding: ActivityCarPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.chatButton.setOnClickListener {
            val intent = Intent(this, CompanyChatScreen::class.java)
            startActivity(intent)
        }

    }
}