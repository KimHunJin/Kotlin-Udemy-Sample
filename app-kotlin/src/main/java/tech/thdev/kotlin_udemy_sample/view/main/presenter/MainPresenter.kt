package tech.thdev.kotlin_udemy_sample.view.main.presenter

import tech.thdev.base.presenter.AbstractPresenter
import tech.thdev.kotlin_udemy_sample.view.main.adapter.model.MainSectionsPagerModel

/**
 * Created by tae-hwan on 12/7/16.
 */

class MainPresenter : AbstractPresenter<MainContract.View>(), MainContract.Presenter {

    lateinit override var pagerModel: MainSectionsPagerModel
}