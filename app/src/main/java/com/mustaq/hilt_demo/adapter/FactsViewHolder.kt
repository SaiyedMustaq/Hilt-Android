package com.mustaq.hilt_demo.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mustaq.hilt_demo.model.PhotosModel
import kotlinx.android.synthetic.main.row_item_facts.view.*

class FactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(list: PhotosModel) {
        itemView.tvId.text = list[position].id.toString()
    }

}