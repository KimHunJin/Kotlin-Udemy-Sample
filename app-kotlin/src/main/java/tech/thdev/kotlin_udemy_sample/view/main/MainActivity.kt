package tech.thdev.kotlin_udemy_sample.view.main

import android.os.Bundle
import tech.thdev.base.view.BaseActivity
import tech.thdev.kotlin_udemy_sample.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
