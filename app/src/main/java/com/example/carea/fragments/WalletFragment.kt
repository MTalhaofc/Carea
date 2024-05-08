package com.example.carea.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.carea.R
import com.example.carea.databinding.FragmentInboxBinding
import com.example.carea.databinding.FragmentWalletBinding


class WalletFragment : Fragment() {

    private var fbinding : FragmentWalletBinding?  =null
    private val binding get() = fbinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fbinding= FragmentWalletBinding.inflate(layoutInflater,container,false)

        return fbinding?.root
    }


}