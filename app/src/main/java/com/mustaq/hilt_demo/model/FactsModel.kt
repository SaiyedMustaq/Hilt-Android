package com.mustaq.hilt_demo.model


import com.google.gson.annotations.SerializedName

data class FactsModel(@SerializedName("all") val all: List<All>) {
    data class All(
        @SerializedName("_id")
        val id: String,
        @SerializedName("text")
        val text: String,
        @SerializedName("type")
        val type: String,
        @SerializedName("upvotes")
        val upvotes: Int,
        @SerializedName("user")
        val user: User,
        @SerializedName("userUpvoted")
        val userUpvoted: Any
    ) {
        data class User(
            @SerializedName("_id")
            val id: String,
            @SerializedName("name")
            val name: Name
        ) {
            data class Name(
                @SerializedName("first")
                val first: String,
                @SerializedName("last")
                val last: String
            )
        }
    }
}