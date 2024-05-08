package com.example.carea.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.carea.R
import com.example.carea.adapters.MyOrdersAdapter
import com.example.carea.databinding.FragmentHomeBinding
import com.example.carea.databinding.FragmentOdersBinding
import com.google.android.material.tabs.TabLayout


class OrdersFragment : Fragment() {


    private var fbinding : FragmentOdersBinding?  =null
    private val binding get() = fbinding
    private lateinit var adapter: MyOrdersAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fbinding= FragmentOdersBinding.inflate(layoutInflater,container,false)

        return fbinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = MyOrdersAdapter(childFragmentManager, lifecycle)

        fbinding?.tabLayout?.addTab(fbinding!!.tabLayout.newTab().setText("Active"))
        binding?.tabLayout?.addTab(binding!!.tabLayout.newTab().setText("Completed"))

        binding?.viewPager?.adapter = adapter

        binding?.tabLayout?.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    val i = it.position.also { binding?.viewPager?.currentItem = it }

                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

        binding?.viewPager?.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding?.tabLayout?.selectTab(binding?.tabLayout!!.getTabAt(position))
            }
        })
    }
}