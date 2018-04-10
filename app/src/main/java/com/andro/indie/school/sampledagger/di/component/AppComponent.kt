package com.andro.indie.school.sampledagger.di.component

import com.andro.indie.school.sampledagger.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun activityComponent(): ActivityComponent.Builder

}