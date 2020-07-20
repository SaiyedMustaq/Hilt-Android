package com.mustaq.hilt_demo.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mustaq.hilt_demo.R
import com.mustaq.hilt_demo.model.PhotosModel
import com.mustaq.hilt_demo.model.UserModel
import kotlinx.android.synthetic.main.row_item_facts.view.*

class FactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(list: PhotosModel.PhotosModelItem) {
        itemView.tvId.text = "Id:- " + list.id.toString()
        itemView.tvAlbumId.text = "Album Id:- " + list.albumId.toString()
        itemView.tvTitle.text = "Album Title:- "+list.title
    }

}