package com.example.carea.activities

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivityHomeBinding
import com.example.carea.databinding.ActivitySpecialOffers2Binding

class SpecialOffers : AppCompatActivity() {

    private lateinit var hsbinding : ActivitySpecialOffers2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        hsbinding = ActivitySpecialOffers2Binding.inflate(layoutInflater)
        setContentView(hsbinding.root)

        //customized to action bar
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.WHITE))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title= "Special Offers"
        supportActionBar?.elevation = 0F
    }
}