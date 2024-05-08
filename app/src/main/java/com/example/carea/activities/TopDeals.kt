package com.example.carea.activities

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.databinding.ActivitySpecialOffers2Binding
import com.example.carea.databinding.ActivityTopDealsBinding

class TopDeals : AppCompatActivity() {
    private lateinit var hsbinding : ActivityTopDealsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        hsbinding = ActivityTopDealsBinding.inflate(layoutInflater)
        setContentView(hsbinding.root)

        //customized to action bar
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.WHITE))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title= "Top Deals"
        supportActionBar?.elevation = 0F
        hsbinding.tvSeeAll.setOnClickListener {
            val intent = Intent(this, RecentSearch::class.java)
            startActivity(intent)
        }
    }
}