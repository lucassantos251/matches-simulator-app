package me.dio.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Runner (
    @SerializedName("name")
    val name: String,
    @SerializedName("stars")
    val stars: Int,
    @SerializedName("image")
    val image: String,

    var score: Int?
) : Parcelable