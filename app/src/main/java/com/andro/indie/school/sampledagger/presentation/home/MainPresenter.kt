package com.andro.indie.school.sampledagger.presentation.home

import com.andro.indie.school.sampledagger.data.repo.ClubRepository
import com.andro.indie.school.sampledagger.di.ActivityScope
import com.andro.indie.school.sampledagger.presentation.base.BasePresenter
import javax.inject.Inject

@ActivityScope
class MainPresenter @Inject constructor(val repo: ClubRepository) : BasePresenter<MainView>() {

    fun getAllClubs() {
        view?.updateProgressLoading(true)
        disposables.add(repo.getClubs(

                response = {
                    it?.let { response ->
                        print("data response : $response")
                        view?.displayClubs(it)
                        view?.updateProgressLoading(false)
                    }
                },

                error = {
                    view?.displayErrorMessage(it.message)
                    view?.updateProgressLoading(false)
                }

        ))
    }
}