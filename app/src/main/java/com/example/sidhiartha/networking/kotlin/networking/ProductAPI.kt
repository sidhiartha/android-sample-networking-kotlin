package com.example.sidhiartha.networking.kotlin.networking

import com.sidhiartha.libs.networks.APIMethod
import com.sidhiartha.libs.networks.BaseAPI

/**
 * Created by sidhiartha on 05/02/18.
 */
sealed class ProductAPI: BaseAPI() {
    class GetHat : ProductAPI()
    class GetJeans : ProductAPI()
    class GetShirt : ProductAPI()

    override val basePath: String
        get() = "http://demo9618857.mockable.io"

    override val method: APIMethod
        get() = APIMethod.GET

    override val params: List<Pair<String, String>>
        get() = listOf()

    override val path: String
        get() {
            return when (this) {
                is GetHat -> "/list/hat"
                is GetJeans -> "/list/jeans"
                is GetShirt -> "/list/shirt"
            }
        }
}