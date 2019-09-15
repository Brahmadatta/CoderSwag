package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslopes Graphics Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$19","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4"),
        Product("Devslopes Graphics Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$19","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4"),
        Product("Devslopes Graphics Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$19","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$32","hoodie2"),
        Product("Devslopes Gray Hoodie","$28","hoodie3"),
        Product("Devslopes Black Hoodie","$32","hoodie4"),
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$32","hoodie2"),
        Product("Devslopes Gray Hoodie","$28","hoodie3"),
        Product("Devslopes Black Hoodie","$32","hoodie4"),
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$32","hoodie2"),
        Product("Devslopes Gray Hoodie","$28","hoodie3"),
        Product("Devslopes Black Hoodie","$32","hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Light Red","$20","shirt2"),
        Product("Devslopes Black Gray Hoodie","$22","shirt3"),
        Product("Devslopes Black Hoodie SnapBack","$22","shirt4"),
        Product("Kickflip Black Hoodie","$18","shirt5"),
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Light Red","$20","shirt2"),
        Product("Devslopes Black Gray Hoodie","$22","shirt3"),
        Product("Devslopes Black Hoodie SnapBack","$22","shirt4"),
        Product("Kickflip Black Hoodie","$18","shirt5"),
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Light Red","$20","shirt2"),
        Product("Devslopes Black Gray Hoodie","$22","shirt3"),
        Product("Devslopes Black Hoodie SnapBack","$22","shirt4"),
        Product("Kickflip Black Hoodie","$18","shirt5")
    )



    val digitalGood = listOf<Product>()

    fun getProducts(category : String) : List<Product>{

        return when(category){
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGood
        }
    }
}