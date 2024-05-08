package com.example.carea.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.carea.R
import com.example.carea.activities.Home
import com.example.carea.activities.SpecialOffers
import com.example.carea.activities.TopDeals
import com.example.carea.adapters.GridViewAdapterCompanies
import com.example.carea.databinding.FragmentHomeBinding
import com.example.carea.models.GridViewModalCompanies


class HomeFragment : Fragment() {

    private var fbinding : FragmentHomeBinding?  =null
    private val binding get() = fbinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fbinding= FragmentHomeBinding.inflate(layoutInflater,container,false)

        binding?.tvSeeAll2?.setOnClickListener {

            val i = Intent(activity,SpecialOffers::class.java)
            startActivity(i)
        }

        binding?.tvSeeAll?.setOnClickListener {

            val i = Intent(activity,TopDeals::class.java)
            startActivity(i)
        }

        return fbinding?.root

    }


}