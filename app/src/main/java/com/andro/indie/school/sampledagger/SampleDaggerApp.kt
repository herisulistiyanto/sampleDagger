package com.andro.indie.school.sampledagger

import android.app.Application
import com.andro.indie.school.sampledagger.di.component.AppComponent
import com.andro.indie.school.sampledagger.di.component.DaggerAppComponent
import com.andro.indie.school.sampledagger.di.module.NetworkModule

class SampleDaggerApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .networkModule(NetworkModule())
                .build()
    }
}