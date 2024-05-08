package com.example.carea.activities
import InboxFragment
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.carea.R

import com.example.carea.databinding.ActivityHomeBinding
import com.example.carea.fragments.HomeFragment
import com.example.carea.fragments.MyOrdersFragment
import com.example.carea.fragments.OrdersFragment
import com.example.carea.fragments.ProfileFragment
import com.example.carea.fragments.WalletFragment
import de.hdodenhof.circleimageview.CircleImageView


class Home : AppCompatActivity() {

    private lateinit var hsbinding : ActivityHomeBinding
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        hsbinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(hsbinding.root)


        //to show custom app bar
        this.supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setDisplayShowCustomEnabled(true)
        supportActionBar?.setCustomView(R.layout.custom_action_bar)
        supportActionBar?.elevation = 0f
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.WHITE))


        val favorite =findViewById<ImageView>(R.id.iv_favorite)
        val notification =findViewById<ImageView>(R.id.iv_notification)

        favorite.setOnClickListener {

            val i = Intent(this,FavouriteCars::class.java)
            startActivity(i)
        }

        notification.setOnClickListener {

            val i = Intent(this,Notifications::class.java)
            startActivity(i)
        }











        hsbinding.bottomNavigationView.setOnItemSelectedListener {

            item -> when(item.itemId){

                com.example.carea.R.id.item_home -> openFragment(HomeFragment())
                com.example.carea.R.id.item_orders -> openFragment(MyOrdersFragment())
                com.example.carea.R.id.item_inbox -> openFragment(InboxFragment())
                com.example.carea.R.id.item_wallet -> openFragment(WalletFragment())
                com.example.carea.R.id.item_profile -> openFragment(ProfileFragment())

            }


            true
        }

        fragmentManager = supportFragmentManager
        openFragment(HomeFragment())

    }

    private fun openFragment(fragment : Fragment) {
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(com.example.carea.R.id.frame_layout_container,fragment)
        fragmentTransaction.commit()

    }
}