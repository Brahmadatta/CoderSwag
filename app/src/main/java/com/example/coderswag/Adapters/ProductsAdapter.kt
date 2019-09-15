package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Product
import com.example.coderswag.R

class ProductsAdapter(val context : Context,val products : List<Product>) : RecyclerView.Adapter<ProductsAdapter.productHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.prooduct_list_item,parent,false)
        return productHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: productHolder, position: Int) {

        holder.bindProductData(context,products[position])
    }


    inner class productHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)


        fun bindProductData(context: Context,product: Product){
            val resourceId = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price

        }
    }

}