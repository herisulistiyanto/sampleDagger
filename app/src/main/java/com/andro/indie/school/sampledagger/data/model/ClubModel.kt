package com.andro.indie.school.sampledagger.data.model

import com.andro.indie.school.sampledagger.presentation.model.Club
import com.google.gson.annotations.SerializedName

data class ClubModel(
        @SerializedName("key") val clubKey: String,
        @SerializedName("name") val clubName: String,
        @SerializedName("code") val clubCode: String?
) {
    fun transform(): Club = Club(name = this.clubName, code = this.clubCode)
}