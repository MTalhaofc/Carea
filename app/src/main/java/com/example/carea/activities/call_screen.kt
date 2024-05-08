package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carea.databinding.ActivityCallScreenBinding

class call_screen : AppCompatActivity() {
    lateinit var binding: ActivityCallScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bmwLogoCall.setOnClickListener() {
            val intent = Intent(this, my_e_wallet::class.java)
            startActivity(intent)
        }

    }
}