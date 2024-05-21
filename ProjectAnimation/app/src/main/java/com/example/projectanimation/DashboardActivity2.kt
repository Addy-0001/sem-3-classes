package com.example.projectanimation

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectanimation.databinding.ActivityDashboard2Binding
import com.example.projectanimation.fragments.HomePageFragment
import com.example.projectanimation.fragments.MessagePageFragment
import com.example.projectanimation.fragments.ProfilePageFragment
import com.example.projectanimation.fragments.SearchPageFragment
import com.google.android.material.navigation.NavigationView
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener

class DashboardActivity2 : AppCompatActivity(), NavigationView, OnNavigationItemSelectedListener {
    lateinit var binding : ActivityDashboard2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDashboard2Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemID){
            R.id.home -> {
                title = "Home"
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentLayout, HomePageFragment()).commit()
            }
            R.id.search -> supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, SearchPageFragment()).commit()

            R.id.profile -> supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, ProfilePageFragment()).commit()

            R.id.message-> supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, MessagePageFragment()).commit()

        }
        binding.main.closeDrawers(GravityCompat.START)
        return true
    }
}