package com.example.task

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity

import com.example.carea.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


            //intent wala code forgot password pr jany k liye
        binding.tvForgetPassword.setOnClickListener {
            val i= Intent(this,ForgetPassword::class.java)
            startActivity(i)
        }

            //intent wala code forgot password pr jany k liye


        binding.btLogin.setOnClickListener {
            val email=binding.etEmail.text
            val password=binding.etPassword.text

            if (TextUtils.isEmpty(email))
            {
                binding.etEmail.error="Enter your Email"
                binding.etEmail.requestFocus()
            }
            else if (TextUtils.isEmpty(password))
            {
                binding.etPassword.error="Enter your Password"
                binding.etPassword.requestFocus()
            }
            else{
                val intent=Intent(this,Profile::class.java)
                startActivity(intent)
                Toast.makeText(this,"Welcome ",LENGTH_SHORT).show()
            }


        }
    }
}