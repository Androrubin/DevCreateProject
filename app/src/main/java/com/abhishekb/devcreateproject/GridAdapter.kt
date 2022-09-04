package com.abhishekb.devcreateproject

import android.content.Context
import android.graphics.Picture
import android.icu.text.CaseMap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//import com.abhishekb.devcreateproject.GridAdapter.*
import com.squareup.picasso.Picasso

//class GridAdapter( val CardTitle: Array<String>, val CardImage:Array<String>):
//    RecyclerView.Adapter<GridViewHolder>()
//     {
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
//        val view =LayoutInflater.from(parent.context).inflate(R.layout.grid_ele,parent,false)
//        return GridViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
//
//        holder.cardTitle.text=CardTitle[position]
//        Picasso.get().load(CardImage[position]).into(holder.cardImage)
//
//    }
//
//    override fun getItemCount(): Int {
//        return CardTitle.size
//    }
//
//    class  GridViewHolder(itemView: View):RecyclerView(itemView) {
//
//        val cardImage:ImageView=itemView.findViewById(R.id.gridImg)
//        val cardTitle: TextView=itemView.findViewById(R.id.gridtitle)
//
//    }
//
//}
