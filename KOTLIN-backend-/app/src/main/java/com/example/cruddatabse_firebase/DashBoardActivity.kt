package com.example.cruddatabse_firebase

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cruddatabse_firebase.databinding.ActivityDashBoardBinding
import com.example.cruddatabse_firebase.model.ProductModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlin.math.log

class DashBoardActivity : AppCompatActivity() {
    lateinit var binding:ActivityDashBoardBinding
    var database : FirebaseDatabase = FirebaseDatabase.getInstance()
    var ref : DatabaseReference = database.reference.child("products")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDashBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener{
            var intent = Intent(this@DashBoardActivity,AddProductActivity::class.java)
            startActivity(intent)
        }

        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
               for (eachData in snapshot.children) {
                   var product = eachData.getValue(ProductModel::class.java)
                   if (product!= null){
                       Log.d("Data from Firebase : ", product.name)
                       Log.d("Data from Firebase : ", product.id)
                       Log.d("Data from Firebase : ", product.price.toString())
                       Log.d("Data from Firebase : ", product.description)

                   }
               }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}