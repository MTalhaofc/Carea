package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivityOfferScreenBinding

class OfferScreen : AppCompatActivity() {
    private lateinit var binding: ActivityOfferScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title= "Make an offer "
        supportActionBar?.elevation = 0F

        binding=ActivityOfferScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnOfferScreen.setOnClickListener {
            Toast.makeText(this, "Back Your Offer", Toast.LENGTH_LONG).show()

            val i = Intent(this, YourOffer::class.java)
            startActivity(i)
        }

    }
}