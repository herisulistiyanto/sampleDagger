package com.andro.indie.school.sampledagger.di.component

import com.andro.indie.school.sampledagger.di.ActivityScope
import com.andro.indie.school.sampledagger.presentation.home.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): ActivityComponent
    }
    fun inject(mainActivity: MainActivity)
}