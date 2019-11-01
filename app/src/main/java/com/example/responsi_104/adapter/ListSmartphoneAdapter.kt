package com.example.responsi_104.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.responsi_104.R
import com.example.responsi_104.model.Smartphone

class ListSmartphoneAdapter (private val listSmartphone: ArrayList<Smartphone>) : RecyclerView.Adapter<ListSmartphoneAdapter.SmartphoneViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartphoneViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_smartphone, parent, false)
        return SmartphoneViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSmartphone.size
    }

    override fun onBindViewHolder(holder: SmartphoneViewHolder, position: Int) {
        val smartphone = listSmartphone[position]
        holder.tvName.text = smartphone.name
        holder.tvDetail.text = smartphone.detail
        Glide.with(holder.itemView.context)
            .load(smartphone.poster)
            .into(holder.imgPoster)

        holder.itemView.setOnClickListener{
            Toast.makeText(
                holder.itemView.context, " Kamu memilih " + listSmartphone[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    inner class SmartphoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}