package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivityNotFoundBinding

class NotFound : AppCompatActivity() {
    private lateinit var binding: ActivityNotFoundBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotFoundBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nextpage.setOnClickListener {
            val intent = Intent(this, SearchResult::class.java)
            startActivity(intent)
        }


    }
}