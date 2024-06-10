package com.example.crud_34b.utils

import com.squareup.picasso.Picasso

class ImageUtils {
    imageUri = imageData.data
    imageUri?.let {
        Picasso.get().load(it).into(addProductBinding.imageBrowse)
    }
}