package com.example.gametask

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gametask.databinding.ActivityBase1Binding
import com.example.gametask.fragments.BlankFragment

class BaseActivity1 : AppCompatActivity() {
    lateinit var baseActivityBase1Binding: ActivityBase1Binding;

    override fun onCreate(savedInstanceState: Bundle?) {
        baseActivityBase1Binding = ActivityBase1Binding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(baseActivityBase1Binding.root)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().replace(baseActivityBase1Binding.frameLayoutNew, BlankFragment).commit()
        }
    }

    fun setData(){
        var TextActivity = baseActivityBase1Binding.displayTextSection
    }
}