package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carea.databinding.ActivityChatScreen1Binding

class chat_screen_1 : AppCompatActivity() {

lateinit var binding: ActivityChatScreen1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgMic.setOnClickListener() {
            val intent = Intent(this, chat_screen_2::class.java)
            startActivity(intent)
        }
    }

    }