package com.example.assignment_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment_1.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var activityLoginBinding: ActivityLoginBinding
    val preferences = getSharedPreferences("loginPrefs", MODE_PRIVATE)
    val editor = preferences.edit()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        activityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(activityLoginBinding.root)

        activityLoginBinding.btnLogin.setOnClickListener{
            var username = activityLoginBinding.usernameField.text.toString()
            var password = activityLoginBinding.passwordField.text.toString()

            if(activityLoginBinding.checkBox.isChecked){
                editor.putString("password", password)
                editor.apply()
            }


        }

    }
}