package com.example.carea.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carea.databinding.ActivityLetsYouInBinding
import android.content.Intent
import com.example.task.login

class LetsYouInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLetsYouInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLetsYouInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogIn.setOnClickListener() {
            val i = Intent(this, login::class.java)
            startActivity(i)
        }
        binding.btnFacebookLogin.setOnClickListener() {
            val i = Intent(this, Home::class.java)
            startActivity(i)
        }


    }
}