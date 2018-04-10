package com.andro.indie.school.sampledagger.presentation.base

import io.reactivex.disposables.CompositeDisposable

open class BasePresenter<V: BaseView> {

    protected var view: V? = null
    protected val disposables = CompositeDisposable()

    fun attach(view: V) {
        this.view = view
    }

    fun onDestroy() {
        this.view = null
        if (!disposables.isDisposed) {
            disposables.dispose()
        }
    }
}