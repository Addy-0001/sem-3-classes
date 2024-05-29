package com.example.cruddatabse_firebase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cruddatabse_firebase.databinding.ActivityAddProductBinding
import com.example.cruddatabse_firebase.model.ProductModel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AddProductActivity : AppCompatActivity() {
    var database : FirebaseDatabase = FirebaseDatabase.getInstance()
    var ref : DatabaseReference = database.reference.child("product")
    lateinit var activityAddProductBinding: ActivityAddProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        activityAddProductBinding = ActivityAddProductBinding.inflate(layoutInflater)
        setContentView(activityAddProductBinding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        activityAddProductBinding.btnProduct.setOnClickListener{
            var name : String = activityAddProductBinding.name.text.toString()
            var price : Int = activityAddProductBinding.price.text.toString().toInt()
            var desc : String = activityAddProductBinding.desctiption.text.toString()

            var id = ref.push().key.toString()
            var data = ProductModel(id, name, price, desc)
            ref.child(id).setValue(data).addOnCompleteListener{

            }
        }

    }
}