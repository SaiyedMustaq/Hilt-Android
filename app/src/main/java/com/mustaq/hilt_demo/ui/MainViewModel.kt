package com.mustaq.hilt_demo.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mustaq.hilt_demo.callResponse.CallResponse
import com.mustaq.hilt_demo.dataResult.ResultData
import com.mustaq.hilt_demo.model.PhotosModel
import com.mustaq.hilt_demo.model.UserModel

class MainViewModel @ViewModelInject constructor(private val callResponse: CallResponse) :
    ViewModel() {

    fun getPhotoFromViewModel(): LiveData<ResultData<PhotosModel>> {
        return liveData {
            emit(ResultData.Loading())
            emit(callResponse.getPhotoList())
        }
    }
}