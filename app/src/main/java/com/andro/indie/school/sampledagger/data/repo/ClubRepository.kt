package com.andro.indie.school.sampledagger.data.repo

import com.andro.indie.school.sampledagger.data.ApiService
import com.andro.indie.school.sampledagger.presentation.model.Club
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ClubRepository @Inject constructor(val apiService: ApiService) {

    fun getClubs(response: (List<Club>?) -> Unit, error: (Throwable) -> Unit): Disposable {
        return apiService.getClubs()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .subscribe(
                        { response(it.clubs?.map { it.transform() }) },
                        { error(it) }
                )
    }

}