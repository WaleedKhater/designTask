package com.example.designtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.designtask.adapter.ViewPagerAdapter
import com.example.designtask.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var tabTitle = arrayOf("Sign Up" , "Login")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var pager = binding.tabViewPager
        var t1 = binding.tabtab
        pager.adapter = ViewPagerAdapter(supportFragmentManager , lifecycle)
        TabLayoutMediator(t1,pager){
            tab , position ->
            tab.text = tabTitle[position]
        }.attach()
    }

}