package me.dio.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match (
    @SerializedName("description")
    val description: String,
    @SerializedName("location")
    val place: Location,
    @SerializedName("runner_1")
    val runner1: Runner,
    @SerializedName("runner_2")
    val runner2: Runner
)