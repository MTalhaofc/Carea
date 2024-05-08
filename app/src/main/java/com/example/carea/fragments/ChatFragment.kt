@file:Suppress("UNREACHABLE_CODE")

package com.example.carea.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carea.R
import com.example.carea.databinding.FragmentChatBinding
import com.example.carea.activities.chat_screen_1


class ChatFragment : Fragment() {
    lateinit var binding: FragmentChatBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
        binding = FragmentChatBinding.inflate(layoutInflater)


        binding.cardViewChatScreen.setOnClickListener() {
            val intent = Intent(this, chat_screen_1::class.java)
            startActivity(intent)
        }
    }

    private fun Intent(chatFragment: ChatFragment, java: Class<chat_screen_1>): Intent? {
        TODO("Not yet implemented")
    }


}
