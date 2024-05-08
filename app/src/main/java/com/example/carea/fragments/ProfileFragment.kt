package com.example.carea.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.carea.R
import com.example.carea.databinding.FragmentProfileBinding
import com.example.carea.databinding.FragmentWalletBinding


class ProfileFragment : Fragment() {

    private var fbinding : FragmentProfileBinding?  =null
    private val binding get() = fbinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fbinding= FragmentProfileBinding.inflate(layoutInflater,container,false)

        return fbinding?.root
    }


}