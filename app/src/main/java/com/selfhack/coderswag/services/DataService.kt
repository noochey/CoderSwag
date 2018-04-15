package com.selfhack.coderswag.services

import com.selfhack.coderswag.model.Category
import com.selfhack.coderswag.model.Product
import java.util.*

object DataService {

    val categories = listOf<Category>(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES", "hoodiesimage"),
            Category("HATS", "hatsimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf<Product>(
            Product("Devslopes Grapginc Beanie","18$", "hat01"),
            Product("Devslopes Hat Black","20$", "hat01"),
            Product("Devslopes Hat White","20$", "hat01"),
            Product("Devslopes Hat Blue","15$", "hat01")
    )

    val hoodies = listOf<Product>(
            Product("Devslopes Hoodi Gray","28$", "hoodie01"),
            Product("Devslopes Hoodi Black","32$", "hoodie02"),
            Product("Devslopes Hoodi Blue","31$", "hoodie03"),
            Product("Devslopes Hoodi White","30$", "hoodie04")
    )

    val shirts = listOf<Product>(
            Product("Devslopes Shirt Gray","18$", "shirt01"),
            Product("Devslopes Shirt Black","22$", "shirt02"),
            Product("Devslopes Shirt Blue","21$", "shirt03"),
            Product("Devslopes Shirt White","20$", "shirt04"),
            Product("Devslopes Shirt Studio","20$", "shirt05")
    )
}