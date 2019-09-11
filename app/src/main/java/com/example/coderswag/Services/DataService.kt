package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val Hats = listOf(
        Product("Devslopes Graphics Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat White","$19","hat03"),
        Product("Devslopes Hat Snapback","$22","hat04")
    )

    val Hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie01"),
        Product("Devslopes Hoodie Red","$32","hoodie02"),
        Product("Devslopes Gray Hoodie","$28","hoodie03"),
        Product("Devslopes Black Hoodie","$32","hoodie04")
    )

    val Shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt01"),
        Product("Devslopes Light Red","$20","shirt02"),
        Product("Devslopes Black Gray Hoodie","$22","shirt03"),
        Product("Devslopes Black Hoodie SnapBack","$22","shirt04"),
        Product("Kickflip Black Hoodie","$18","shirt05")
    )
}