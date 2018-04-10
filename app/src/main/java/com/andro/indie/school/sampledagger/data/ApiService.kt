package com.andro.indie.school.sampledagger.data

import com.andro.indie.school.sampledagger.data.model.ClubResponse
import io.reactivex.Flowable
import retrofit2.http.GET

interface ApiService {

    @GET("opendatajson/football.json/master/2017-18/es.1.clubs.json")
    fun getClubs(): Flowable<ClubResponse>

}