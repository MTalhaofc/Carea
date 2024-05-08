package com.example.carea.fragments

import android.content.Intent
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carea.activities.TrackOrder
import com.example.carea.databinding.FragmentActiveBinding

class ActiveFragment : Fragment() {
    private var _binding: FragmentActiveBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentActiveBinding.inflate(inflater, container, false)
        val view = binding.root

        // Initialize the button after inflating the layout
        binding.btnTrackOrder.setOnClickListener {
            val intent = Intent(requireContext(), TrackOrder::class.java)
            startActivity(intent)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
