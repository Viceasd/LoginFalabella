package com.viceasd.loginfalabella.models

import com.google.gson.Gson

data class DetailsViewModel(val posts: List<Post>, val users: List<User>, val albums: List<Album>) {
    fun toJson(): String {
        return Gson().toJson(this)
    }
}