package com.mustaq.hilt_demo.model

import androidx.recyclerview.widget.DiffUtil

class DiffUtilsFactsModel : DiffUtil.ItemCallback<PhotosModel>() {
    override fun areItemsTheSame(
        oldItem: PhotosModel,
        newItem: PhotosModel
    ): Boolean {
        return oldItem[0].id == newItem[0].id
    }

    override fun areContentsTheSame(
        oldItem: PhotosModel,
        newItem: PhotosModel
    ): Boolean {
        return newItem == oldItem
    }


}