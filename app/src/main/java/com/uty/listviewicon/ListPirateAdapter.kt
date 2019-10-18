package com.uty.listviewicon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uty.listviewicon.R
import com.uty.listviewicon.model.Pirate


class ListPirateAdapter(private val listPirate: ArrayList<Pirate>) : RecyclerView.Adapter<ListPirateAdapter.PirateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PirateViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_pirate, parent, false)
        return PirateViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPirate.size
    }

    override fun onBindViewHolder(holder: PirateViewHolder, position: Int) {
        val pirate = listPirate[position]
        holder.tvName.text = pirate.name
        holder.tvDetail.text = pirate.detail
        Glide.with(holder.itemView.context)
            .load(pirate.poster)
            .into(holder.imgPoster)
    }

    inner class PirateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}