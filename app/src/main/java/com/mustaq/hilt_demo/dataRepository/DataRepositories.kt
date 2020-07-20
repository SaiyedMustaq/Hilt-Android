package com.mustaq.hilt_demo.dataRepository

import com.mustaq.hilt_demo.model.PhotosModel
import com.mustaq.hilt_demo.model.UserModel
import com.mustaq.hilt_demo.networkCall.ApiServices
import javax.inject.Inject

class DataRepositories
@Inject constructor(private val apiServices: ApiServices) {
    suspend fun getPhotosRepo(): PhotosModel {
        return apiServices.getPhotos()
    }

}