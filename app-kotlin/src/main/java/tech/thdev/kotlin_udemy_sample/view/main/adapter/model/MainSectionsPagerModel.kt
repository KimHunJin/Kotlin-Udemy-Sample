package tech.thdev.kotlin_udemy_sample.view.main.adapter.model

import java.util.*

/**
 * Created by tae-hwan on 12/7/16.
 */

interface MainSectionsPagerModel {

    var itemList: ArrayList<String>?

    fun getPhotoId(position: Int): String

    fun getPhotoUrl(position: Int): String
}