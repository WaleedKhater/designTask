package com.example.designtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.example.designtask.adapter.GridAdapter
import com.example.designtask.databinding.ActivityGridBinding
import com.example.designtask.fragments.BottomFragment
import com.example.designtask.model.Grid

class GridActivity : AppCompatActivity() {
    lateinit var binding: ActivityGridBinding
    lateinit var adapter: GridAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityGridBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.showButton.setOnClickListener {

            val dialog = BottomFragment()
            dialog.show(supportFragmentManager , "bottom")

        }
    }

}