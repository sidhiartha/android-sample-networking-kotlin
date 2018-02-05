package com.example.sidhiartha.networking.kotlin

import android.util.Log
import com.example.sidhiartha.networking.kotlin.networking.ProductAPI
import com.sidhiartha.libs.activities.BaseActivity

class MainActivity : BaseActivity()
{
    override fun layoutResource(): Int = R.layout.activity_main

    override fun viewDidLoad()
    {
        ProductAPI.GetHat().execute { request, response, result ->
            Log.i(javaClass.simpleName, "hat")
            Log.i(javaClass.simpleName, "request $request")
            Log.i(javaClass.simpleName, "result ${result.get().content}")
        }

        ProductAPI.GetJeans().execute { request, response, result ->
            Log.i(javaClass.simpleName, "jeans")
            Log.i(javaClass.simpleName, "request $request")
            Log.i(javaClass.simpleName, "result ${result.get().content}")
        }

        ProductAPI.GetShirt().execute { request, response, result ->
            Log.i(javaClass.simpleName, "shirt")
            Log.i(javaClass.simpleName, "request $request")
            Log.i(javaClass.simpleName, "result ${result.get().content}")
        }
    }
}
