package com.example.sidhiartha.networking.kotlin.models

/**
 * Created by sidhiartha on 05/02/18.
 */

class ProductModel(val id: Int, val name: String, val brand: String, val imageUrl: String,
                   val description: String, val price: String)
{
    override fun toString(): String {
        return "ProductModel(id=$id, name='$name', brand='$brand', imageUrl='$imageUrl', description='$description', price='$price')"
    }
}