package com.mustaq.hilt_demo.model


import com.google.gson.annotations.SerializedName

class UserModel : ArrayList<UserModel.UserModelItem>(){
    data class UserModelItem(
        @SerializedName("body")
        val body: String, // cupiditate quo est a modi nesciunt solutaipsa voluptas error itaque dicta inautem qui minus magnam et distinctio eumaccusamus ratione error aut
        @SerializedName("id")
        val id: Int, // 100
        @SerializedName("title")
        val title: String, // at nam consequatur ea labore ea harum
        @SerializedName("userId")
        val userId: Int // 10
    )
}