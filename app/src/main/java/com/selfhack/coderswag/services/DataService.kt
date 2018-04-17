package com.selfhack.coderswag.services

import com.selfhack.coderswag.model.Category
import com.selfhack.coderswag.model.Product
import java.util.*

object DataService {

    val categories = listOf<Category>(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf<Product>(
            Product("Devslopes Grapginc Beanie", "18$", "hat1"),
            Product("Devslopes Hat Black", "20$", "hat1"),
            Product("Devslopes Hat White", "20$", "hat1"),
            Product("Devslopes Hat Blue", "15$", "hat1")
    )

    val hoodies = listOf<Product>(
            Product("Devslopes Hoodi Gray", "28$", "hoodie1"),
            Product("Devslopes Hoodi Black", "32$", "hoodie2"),
            Product("Devslopes Hoodi Blue", "31$", "hoodie3"),
            Product("Devslopes Hoodi White", "30$", "hoodie4")
    )

    val shirts = listOf<Product>(
            Product("Devslopes Shirt Gray", "18$", "shirt1"),
            Product("Devslopes Shirt Black", "22$", "shirt2"),
            Product("Devslopes Shirt Blue", "21$", "shirt3"),
            Product("Devslopes Shirt White", "20$", "shirt4"),
            Product("Devslopes Shirt Studio", "20$", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when (category) {
            "SHIRTS" ->  shirts
            "HATS" ->  hats
            "HOODIES" ->  hoodies
            else -> digitalGoods
        }
    }
}