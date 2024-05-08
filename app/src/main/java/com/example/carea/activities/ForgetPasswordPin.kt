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
import com.example.carea.databinding.ActivityForgetPasswordBinding
import com.example.carea.databinding.ActivityForgetPasswordPinBinding
import com.example.task.login

class ForgetPasswordPin : AppCompatActivity() {
    private lateinit var hsbinding: ActivityForgetPasswordPinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        hsbinding= ActivityForgetPasswordPinBinding.inflate(layoutInflater)
        setContentView(hsbinding.root)

        supportActionBar?.title= "Forget Password"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.elevation = 0f
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.WHITE))


        hsbinding.btnVerify.setOnClickListener {
            val i = Intent(this,login::class.java)
            startActivity(i)
        }
    }
}