package com.example.petshopex01

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterPetShop(val mainActivity: Context,
                    val itens: List<String>)
    : RecyclerView.Adapter<PetShopViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetShopViewHolder {
        val view = LayoutInflater.from(mainActivity)
            .inflate(R.layout.item_petshop_layout,parent,false)

        return PetShopViewHolder(view)
    }

    override fun onBindViewHolder(holder: PetShopViewHolder, position: Int) {
        val nomeAluno: String = itens[position]
        holder.itensVenda.text = nomeAluno
    }

    override fun getItemCount(): Int {
        return itens.size

    }



}