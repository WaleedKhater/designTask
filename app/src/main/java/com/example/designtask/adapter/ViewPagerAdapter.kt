package com.example.designtask.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.designtask.fragments.LoginFragment
import com.example.designtask.fragments.SignUpFragment

class ViewPagerAdapter(fragmentManger: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManger, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return SignUpFragment()
            1 -> return LoginFragment()
            else -> return SignUpFragment()
        }
    }
}