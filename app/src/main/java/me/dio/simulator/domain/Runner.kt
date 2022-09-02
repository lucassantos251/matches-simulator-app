package me.dio.simulator.domain

import com.google.gson.annotations.SerializedName

data class Runner (
    @SerializedName("name")
    val name: String,
    @SerializedName("stars")
    val stars: Int,
    @SerializedName("image")
    val image: String
)