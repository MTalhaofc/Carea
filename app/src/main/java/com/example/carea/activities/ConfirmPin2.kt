package com.example.carea.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import com.example.carea.databinding.PopupBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import android.widget.EditText
import com.example.carea.R
import com.example.carea.databinding.ActivityConfirmPin2Binding

class ConfirmPin2 : AppCompatActivity() {
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var editText4: EditText
    private lateinit var binding:ActivityConfirmPin2Binding
    private lateinit var popupBinding: PopupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityConfirmPin2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        editText1 = binding.box1
        editText2 = binding.box2
        editText3 = binding.box3
        editText4 = binding.box4

        setupEditTextListeners()
        binding.btnContinue.setOnClickListener {
            showPopupView()
        }
    }

    private fun showPopupView() {
        popupBinding = PopupBinding.inflate(layoutInflater)
        val dialog = MaterialAlertDialogBuilder(this)
            .setView(popupBinding.root)
            .create()

        popupBinding.btnViewOrder.setOnClickListener{
            val i = Intent(this, Home::class.java)
            startActivity(i)
        }
        popupBinding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun setupEditTextListeners() {
        val editTextList = listOf(editText1, editText2, editText3, editText4)

        editTextList.forEachIndexed { index, editText ->
            editText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

                override fun afterTextChanged(s: Editable?) {
                    if (s?.length == 1) {
                        focusNextEditText(index)
                    }
                }
            })
        }
    }

    private fun focusNextEditText(currentIndex: Int) {
        if (currentIndex < 3) {
            val nextEditTextId = when (currentIndex) {
                0 -> R.id.box2
                1 -> R.id.box3
                2 -> R.id.box4
                else -> -1 // Handle edge case if needed
            }
            findViewById<EditText>(nextEditTextId)?.requestFocus()
        }
    }
}

