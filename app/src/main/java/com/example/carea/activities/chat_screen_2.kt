package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carea.databinding.ActivityChatScreen2Binding

class chat_screen_2 : AppCompatActivity() {
    lateinit var binding: ActivityChatScreen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityChatScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ImgNextScreen.setOnClickListener(){
            val intent = Intent(this, call_screen::class.java)
            startActivity(intent)
        }
    }
}