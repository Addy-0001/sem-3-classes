package com.example.crud_34b.repository

import android.content.Intent
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import com.example.crud_34b.databinding.ActivityAddProductBinding
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import kotlinx.coroutines.flow.callbackFlow
import java.util.UUID

class ProductRepositoryImpl : ProductRepository {
    var firebaseDatabase: FirebaseDatabase = FirebaseDatabase.getInstance()
    var ref = firebaseDatabase.reference.child("products")

    var firebaseStorage: FirebaseStorage = FirebaseStorage.getInstance()
    var storageRef: StorageReference = firebaseStorage.reference.child("products")

    lateinit var addProductBinding: ActivityAddProductBinding

    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>
    var imageUri: Uri? = null
    fun uploadImage() {
        val imageName = UUID.randomUUID().toString()

        var imageReference = storageRef.child("products").child(imageName)

        imageUri?.let { url ->
            imageReference.putFile(url).addOnSuccessListener {
                imageReference.downloadUrl.addOnSuccessListener { downloadUrl ->
                    var imagesUrl = downloadUrl.toString()
                    callback(true, imagesUrl, imageName)
                }
            }.addOnFailureListener {

            }
        }
    }
}