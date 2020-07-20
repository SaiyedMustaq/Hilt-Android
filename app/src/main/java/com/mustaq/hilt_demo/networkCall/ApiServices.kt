package com.mustaq.hilt_demo.networkCall

import com.mustaq.hilt_demo.model.PhotosModel
import com.mustaq.hilt_demo.networkConstant.NetworkConstant.FACTS
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {
    @GET(FACTS)
    suspend fun getPhotos(): List<PhotosModel>

}