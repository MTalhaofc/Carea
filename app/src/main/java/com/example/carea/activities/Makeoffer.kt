package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivityMakeofferBinding

class Makeoffer : AppCompatActivity() {
    private lateinit var binding: ActivityMakeofferBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMakeofferBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.makeOffer.setOnClickListener {
            val intent = Intent(this, ClockScreen::class.java)
            startActivity(intent)
        }

    }
}