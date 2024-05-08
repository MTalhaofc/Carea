package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivityRecentSearchBinding

class RecentSearch : AppCompatActivity() {
    private lateinit var binding: ActivityRecentSearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            ActivityRecentSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recentSearchone.setOnClickListener {
            val intent = Intent(this, NotFound::class.java)
            startActivity(intent)
        }
    }
}