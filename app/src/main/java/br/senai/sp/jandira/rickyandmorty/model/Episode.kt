package br.senai.sp.jandira.rickyandmorty.model

import com.google.gson.annotations.SerializedName

data class Episode(
    val id: Int = 0,
    val name: String = "",
    @SerializedName("air_date") val airDate: String = "",
    val episode: String = "",
    val characters: List<String>,
    val url: String = "",
    val created: String = ""
)
