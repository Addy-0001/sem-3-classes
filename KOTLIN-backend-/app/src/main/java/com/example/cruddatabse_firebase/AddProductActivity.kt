package com.example.cruddatabse_firebase

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cruddatabse_firebase.databinding.ActivityAddProductBinding
import com.example.cruddatabse_firebase.model.ProductModel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AddProductActivity : AppCompatActivity() {
    var database:FirebaseDatabase=FirebaseDatabase.getInstance()
    var ref : DatabaseReference = database.reference.child("products")
    lateinit var binding:ActivityAddProductBinding

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == 1 && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            val intent = Intent()
            intent.type = "image/*"
            intent.action = Intent.ACTION_GET_CONTENT
            activityResultLauncher.launch(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAddProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProduct.setOnClickListener{
            var name:String = binding.name.text.toString()
            var price:Int = binding.price.text.toString().toInt()
            var desc:String = binding.description.text.toString()

            var id = ref.push().key.toString() //creates random unique id for database entities

            var data = ProductModel(id,name,price,desc)

            ref.child(id).setValue(data).addOnCompleteListener {
                if(it.isSuccessful){
                    Toast.makeText(applicationContext, "Data Added", Toast.LENGTH_LONG).show()
                    finish()
                }else{
                    Toast.makeText(applicationContext,it.exception?.message,Toast.LENGTH_LONG).show()
                }
            }

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun registerActivityForResult() {
        activityResultLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult(),
            ActivityResultCallback { result ->

                val resultcode = result.resultCode
                val imageData = result.data
                if (resultcode == RESULT_OK && imageData != null) {
                    var imageUri = imageData.data
                    imageUri?.let {
                        Picasso.get().load(it).into(addProductBinding.imageBrowse)
                    }
                }

            })
    }
}