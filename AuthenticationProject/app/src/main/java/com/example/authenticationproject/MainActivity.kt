package com.example.authenticationproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.authenticationproject.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding;
    var auth: FirebaseAuth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.forgotPasswordText.setOnClickListener {
            var intent = Intent(this@MainActivity, ForgotPassword::class.java)
            startActivity(intent)
        }
        activityMainBinding.btnSubmit.setOnClickListener {
            var email: String = activityMainBinding.emailAddressField.text.toString()
            var password: String = activityMainBinding.passwordField.text.toString()
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                if (it.isSuccessful) {
                    Toast.makeText(
                        applicationContext, "Registration Successs", Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(applicationContext, it.exception?.message, Toast.LENGTH_LONG)
                        .show()
                }
            }

            activityMainBinding.btnLogin.setOnClickListener {
                var email: String = activityMainBinding.emailAddressField.text.toString()
                var password: String = activityMainBinding.passwordField.text.toString()
                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(
                            applicationContext, "You are now signed in.", Toast.LENGTH_LONG
                        ).show()
                    } else {
                        Toast.makeText(applicationContext, it.exception?.message, Toast.LENGTH_LONG)
                            .show()
                    }
                }


            }
        }
    }
}