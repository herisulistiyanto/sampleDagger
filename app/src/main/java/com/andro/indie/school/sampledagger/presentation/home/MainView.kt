package com.andro.indie.school.sampledagger.presentation.home

import com.andro.indie.school.sampledagger.presentation.base.BaseView
import com.andro.indie.school.sampledagger.presentation.model.Club

interface MainView: BaseView {
    fun displayClubs(dataClubs: List<Club>)
    fun displayErrorMessage(message: String?)
}