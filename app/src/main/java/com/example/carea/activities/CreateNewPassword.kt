package com.example.carea.activities

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColor
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carea.R
import com.example.carea.R.layout.alert_new_password
import com.example.carea.databinding.ActivityCreateNewPasswordBinding

class CreateNewPassword : AppCompatActivity() {
    private lateinit var hsbinding : ActivityCreateNewPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hsbinding = ActivityCreateNewPasswordBinding.inflate(layoutInflater)
        setContentView(hsbinding.root)

        //customized to action bar 
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.WHITE))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title= "Create New Password"
        supportActionBar?.elevation = 0F


        //click and show alert box and go to home screen
        hsbinding.btNewPasswordContinue.setOnClickListener {




            //call function of custom dialog box
            showAlert()


            //move to home screen after a few time
            Handler(Looper.getMainLooper()).postDelayed(
                {
                  val i = Intent(this,Home::class.java)
                    startActivity(i)
                    finish()
                },3000
            )
        }





    }

    //function for build custom dialog box
    private fun showAlert() {
        val dialog= Dialog(this)

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(alert_new_password)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()

    }
}