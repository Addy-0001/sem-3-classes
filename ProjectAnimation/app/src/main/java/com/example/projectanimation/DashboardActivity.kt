package com.example.projectanimation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.projectanimation.databinding.ActivityDashboardBinding
import com.example.projectanimation.fragments.HomePageFragment
import com.example.projectanimation.fragments.MessagePageFragment
import com.example.projectanimation.fragments.ProfilePageFragment
import com.example.projectanimation.fragments.SearchPageFragment

class DashboardActivity : AppCompatActivity() {

    lateinit var activityDashboardBinding: ActivityDashboardBinding;

    private fun replaceFragment(fragment : Fragment) {
        var fragmentManager: FragmentManager = supportFragmentManager;
        var fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout, fragment)
        fragmentTransaction.commit()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        activityDashboardBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(activityDashboardBinding.root)

        activityDashboardBinding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(HomePageFragment())
                R.id.search -> replaceFragment(SearchPageFragment())
                R.id.message -> replaceFragment(MessagePageFragment())
                R.id.profile -> replaceFragment(ProfilePageFragment())
                else->{}
            }
            true
        }
    }
}