package tech.thdev.kotlin_udemy_sample.view.main

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import tech.thdev.base.view.BasePresenterActivity
import tech.thdev.kotlin_udemy_sample.R
import tech.thdev.kotlin_udemy_sample.view.main.adapter.MainSectionsPagerAdapter
import tech.thdev.kotlin_udemy_sample.view.main.presenter.MainContract
import tech.thdev.kotlin_udemy_sample.view.main.presenter.MainPresenter

class MainActivity : BasePresenterActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {

    override fun onCreatePresenter() = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val mainSectionsPagerAdapter = MainSectionsPagerAdapter(supportFragmentManager)

        presenter?.pagerModel = mainSectionsPagerAdapter

        container.adapter = mainSectionsPagerAdapter

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_home -> {
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_search -> {
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_about -> {
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}
