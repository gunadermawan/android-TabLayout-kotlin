package com.gunder.mytablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPageAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
       return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragmennt :  Fragment? = null
        when(position){
            0 -> fragmennt = HomeFragment()
            1 -> fragmennt = ProfileFragment()
        }
        return fragmennt as Fragment
    }
}