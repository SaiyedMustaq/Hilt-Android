package com.mustaq.hilt_demo.callResponse

import android.util.Log
import com.mustaq.hilt_demo.dataRepository.DataRepositories
import com.mustaq.hilt_demo.dataResult.ResultData
import com.mustaq.hilt_demo.model.PhotosModel
import com.mustaq.hilt_demo.model.UserModel
import javax.inject.Inject

class CallResponse @Inject constructor(private val dataRepositories: DataRepositories) {
    suspend fun getPhotoList(): ResultData<PhotosModel> {
        val repoResult = dataRepositories.getPhotosRepo()
        Log.e("TAG", "getPhotoList: $repoResult" )
        //val repoCode = dataRepositories.getRepo().hashCode()
        val result = if (repoResult.isNotEmpty()) {
            ResultData.Success(repoResult)
        } else {
            ResultData.Failed("Something Went wrong")
        }
        return result
    }
}