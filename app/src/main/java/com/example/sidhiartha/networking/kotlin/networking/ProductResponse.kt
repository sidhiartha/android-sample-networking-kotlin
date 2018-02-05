package com.example.sidhiartha.networking.kotlin.networking

import com.example.sidhiartha.networking.kotlin.models.ProductModel

/**
 * Created by sidhiartha on 05/02/18.
 */
class ProductResponse(val status: Boolean, val list: List<ProductModel>)
{
    override fun toString(): String {
        return "ProductResponse(status=$status, list=$list)"
    }
}