package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivityClockScreenBinding
import com.example.carea.databinding.ActivityMakeofferBinding

class ClockScreen : AppCompatActivity() {
    private lateinit var binding: ActivityClockScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClockScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackHome.setOnClickListener {
            Toast.makeText(this, "Offer Proceed", Toast.LENGTH_LONG).show()

            val i = Intent(this, YourOffer::class.java)
            startActivity(i)
        }


    }
}