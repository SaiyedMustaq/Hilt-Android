package com.mustaq.hilt_demo.networkCall

import com.mustaq.hilt_demo.model.PhotosModel
import com.mustaq.hilt_demo.model.UserModel
import com.mustaq.hilt_demo.networkConstant.NetworkConstant.FACTS
import com.mustaq.hilt_demo.networkConstant.NetworkConstant.POSTS
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {
    @GET(POSTS)
    suspend fun getPhotos(): PhotosModel

}