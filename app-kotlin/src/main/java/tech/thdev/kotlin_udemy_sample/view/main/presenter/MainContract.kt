package tech.thdev.kotlin_udemy_sample.view.main.presenter

import tech.thdev.base.presenter.BasePresenter
import tech.thdev.base.presenter.BaseView
import tech.thdev.kotlin_udemy_sample.view.main.adapter.model.MainSectionsPagerModel

/**
 * Created by tae-hwan on 12/7/16.
 */

interface MainContract {
    interface View : BaseView

    interface Presenter : BasePresenter<View> {

        var pagerModel: MainSectionsPagerModel
    }
}