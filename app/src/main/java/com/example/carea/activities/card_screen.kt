package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carea.databinding.ActivityCardScreenBinding

class card_screen : AppCompatActivity() {
    lateinit var binding: ActivityCardScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinueCardScreen.setOnClickListener() {
            val intent = Intent(this, pin_screent::class.java)
            startActivity(intent)
        }
    }
}