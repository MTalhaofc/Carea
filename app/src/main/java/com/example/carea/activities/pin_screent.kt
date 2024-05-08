package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carea.databinding.ActivityPinScreentBinding

class pin_screent : AppCompatActivity() {
    lateinit var binding: ActivityPinScreentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPinScreentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinuePinScreen.setOnClickListener() {
            val intent = Intent(this, transaction_screen::class.java)
            startActivity(intent)
        }
//        binding.btnContinuePinScreen.setOnClickListener {
//            showPopupView()
//        }
//    }
//
//    private fun showPopupView() {
//
//        bialert_pin_screen = alert_pin_screen.inflate(layoutInflater)
//        val dialog = MaterialAlertDialogBuilder(this)
//            .setView(alert_pin_screen.root)
//            .create()
//
//        alert_pin_screen..setOnClickListener {
//            dialog.dismiss()
//        }
//
//        dialog.show()
//
//    }

    }
}