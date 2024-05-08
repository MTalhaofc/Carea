package com.example.carea


import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import com.example.carea.activities.Home

class BottomPopupDialog(context: Context) : Dialog(context) {

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.popup_layout)

        window?.setBackgroundDrawableResource(android.R.color.transparent)
        window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.BOTTOM)
        setCanceledOnTouchOutside(true)

        window?.attributes?.windowAnimations = R.style.DialogAnimation

        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val intent = Intent(context, Home::class.java)
            context.startActivity(intent)
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
        // Adjust window size and position after the layout has been inflated
        window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }
}
