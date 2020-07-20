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
        itemView.tvId.text = list.id.toString()
        itemView.tvAlbumId.text = list.albumId.toString()
        itemView.tvTitle.text = list.title

        Glide
            .with(itemView.context)
            .load(list.thumbnailUrl)
            .centerCrop()
            .placeholder(R.drawable.ic_plaseholder)
            .error(R.drawable.ic_error_image)
            .into(itemView.imagethumbnail)



        Glide
            .with(itemView.context)
            .load(list.url)
            .centerCrop()
            .placeholder(R.drawable.ic_plaseholder)
            .error(R.drawable.ic_error_image)
            .into(itemView.imageUrl)
    }

}