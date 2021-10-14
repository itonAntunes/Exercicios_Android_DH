package com.example.petshopex01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.HORIZONTAL
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@SuppressLint("WrongConstant")
class MainActivity : AppCompatActivity() {
    /*
    * instanciando a recycler com o by lazy e chamando a variavel no OnCreate
    * */

    private val recycler by lazy{
        RecyclerView(this)
    }

    private val manager by lazy{
        LinearLayoutManager(this, VERTICAL, false)
//        GridLayoutManager(this,3,VERTICAL, false)
    }

    private val itens = listOf(
        "Ração ",
        "Roupas",
        "Casinhas",
        "Brinquedos",
        "Remédios",
        "Acessórios",
    )





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(recycler)

        recycler.layoutManager = manager
        recycler.adapter = AdapterPetShop(this, itens)

    }
}