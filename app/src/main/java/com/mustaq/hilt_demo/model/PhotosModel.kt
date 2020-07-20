package com.mustaq.hilt_demo.model


import com.google.gson.annotations.SerializedName

class PhotosModel : ArrayList<PhotosModel.PhotosModelItem>(){
    data class PhotosModelItem(
        @SerializedName("albumId")
        val albumId: Int, // 100
        @SerializedName("id")
        val id: Int, // 5000
        @SerializedName("thumbnailUrl")
        val thumbnailUrl: String, // https://via.placeholder.com/150/6dd9cb
        @SerializedName("title")
        val title: String, // error quasi sunt cupiditate voluptate ea odit beatae
        @SerializedName("url")
        val url: String // https://via.placeholder.com/600/6dd9cb
    )
}