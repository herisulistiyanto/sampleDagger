package com.andro.indie.school.sampledagger.data.model

import com.google.gson.annotations.SerializedName

data class ClubResponse(
        @SerializedName("name") val name: String,
        @SerializedName("clubs") val clubs: List<ClubModel>?
)