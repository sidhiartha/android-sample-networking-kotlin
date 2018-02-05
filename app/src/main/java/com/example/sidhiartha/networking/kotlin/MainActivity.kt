package com.example.sidhiartha.networking.kotlin

import android.util.Log
import com.example.sidhiartha.networking.kotlin.networking.ProductAPI
import com.example.sidhiartha.networking.kotlin.networking.ProductResponse
import com.sidhiartha.libs.activities.BaseActivity

class MainActivity : BaseActivity()
{
    override fun layoutResource(): Int = R.layout.activity_main

    override fun viewDidLoad()
    {
        ProductAPI.GetHat().execute(ProductResponse::class.java) { response, errorMessage ->
            Log.i(javaClass.simpleName, "hat")
            Log.i(javaClass.simpleName, "response $response")
            Log.i(javaClass.simpleName, "error $errorMessage")
        }

        ProductAPI.GetJeans().execute(ProductResponse::class.java){ response, errorMessage ->
            Log.i(javaClass.simpleName, "jeans")
            Log.i(javaClass.simpleName, "response $response")
            Log.i(javaClass.simpleName, "error $errorMessage")
        }

        ProductAPI.GetShirt().execute(ProductResponse::class.java) { response, errorMessage ->
            Log.i(javaClass.simpleName, "shirt")
            Log.i(javaClass.simpleName, "response $response")
            Log.i(javaClass.simpleName, "error $errorMessage")
        }
    }
}
