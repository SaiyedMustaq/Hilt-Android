package com.mustaq.hilt_demo.model

import androidx.recyclerview.widget.DiffUtil

class DiffUtilsFactsModel : DiffUtil.ItemCallback<PhotosModel.PhotosModelItem>() {
    override fun areItemsTheSame(
        oldItem: PhotosModel.PhotosModelItem,
        newItem: PhotosModel.PhotosModelItem
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: PhotosModel.PhotosModelItem,
        newItem: PhotosModel.PhotosModelItem
    ): Boolean {
        return newItem == oldItem
    }


}