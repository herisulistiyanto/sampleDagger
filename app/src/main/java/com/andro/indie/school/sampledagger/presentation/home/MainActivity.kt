package com.andro.indie.school.sampledagger.presentation.home

import android.view.View
import com.andro.indie.school.sampledagger.R
import com.andro.indie.school.sampledagger.SampleDaggerApp
import com.andro.indie.school.sampledagger.di.component.ActivityComponent
import com.andro.indie.school.sampledagger.presentation.base.BaseActivity
import com.andro.indie.school.sampledagger.presentation.model.Club
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun initInjection() {
        val activityComponent: ActivityComponent = (applicationContext as SampleDaggerApp)
                .appComponent
                .activityComponent()
                .build()

        activityComponent.inject(this)
    }

    override fun initLayout() {
        setContentView(R.layout.activity_main)
        presenter.attach(this)
        btnLoad.setOnClickListener {
            presenter.getAllClubs()
        }
    }

    override fun displayClubs(dataClubs: List<Club>) {
        val names = dataClubs.map {
            it.name
        }.joinToString("\n")

        tvClubs.text = names
    }

    override fun updateProgressLoading(visible: Boolean) {
        pbLoading.visibility = if (visible) View.VISIBLE else View.GONE
    }

    override fun displayErrorMessage(message: String?) {

    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }
}
