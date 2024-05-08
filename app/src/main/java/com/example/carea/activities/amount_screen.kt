package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carea.databinding.ActivityAmoutScreenBinding

class amount_screen : AppCompatActivity() {
    lateinit var binding: ActivityAmoutScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAmoutScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnContinueAmountScreen.setOnClickListener() {
            val intent = Intent(this, card_screen::class.java)
            startActivity(intent)
        }

    }
}