package com.example.petshopex01
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PetShopViewHolder(view: View):RecyclerView.ViewHolder(view) {

    var itensVenda = view.findViewById<TextView>(R.id.item_text)

}