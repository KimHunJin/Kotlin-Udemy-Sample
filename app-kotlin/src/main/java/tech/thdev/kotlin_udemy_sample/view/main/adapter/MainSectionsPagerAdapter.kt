package tech.thdev.kotlin_udemy_sample.view.main.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import tech.thdev.kotlin_udemy_sample.view.main.adapter.model.MainSectionsPagerModel
import tech.thdev.kotlin_udemy_sample.view.recent_image.ImageFragment
import java.util.*


/**
 * Created by tae-hwan on 12/7/16.
 */

class MainSectionsPagerAdapter(fragmentManager: FragmentManager) :
        FragmentPagerAdapter(fragmentManager), MainSectionsPagerModel {

    override var itemList: ArrayList<String>? = null

    init {
        itemList = ArrayList<String>()
        itemList?.add("Home")
        itemList?.add("Search")
        itemList?.add("About")
    }

    override fun getItem(position: Int): Fragment {
        return ImageFragment.getInstance()
    }

    override fun getCount(): Int {
        return itemList?.size ?: 0
    }

    override fun getPhotoId(position: Int): String {
        return ""
    }

    override fun getPhotoUrl(position: Int): String {
        return ""
    }
}