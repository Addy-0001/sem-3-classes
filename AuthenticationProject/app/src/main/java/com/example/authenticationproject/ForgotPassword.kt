package com.example.authenticationproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.authenticationproject.databinding.ActivityForgotPasswordBinding
import com.google.firebase.auth.FirebaseAuth

class ForgotPassword : AppCompatActivity() {
    lateinit var activityForgotPasswordBinding: ActivityForgotPasswordBinding
    var auth : FirebaseAuth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        activityForgotPasswordBinding = ActivityForgotPasswordBinding.inflate(layoutInflater)

        setContentView(activityForgotPasswordBinding.root)
        activityForgotPasswordBinding.btnForget.setOnClickListener{
            var email = activityForgotPasswordBinding.forgotpassEmailField.text.toString()
            auth.sendPasswordResetEmail(email).addOnCompleteListener{
                if (it.isSuccessful){
                    Toast.makeText(applicationContext,
                        "Mail Sent", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(applicationContext, it.exception?.message, Toast.LENGTH_LONG).show()
                }
            }
        }


    }
}