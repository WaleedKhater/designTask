package com.example.designtask.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import com.example.designtask.R
import com.example.designtask.adapter.GridAdapter
import com.example.designtask.databinding.ActivityGridBinding
import com.example.designtask.databinding.FragmentBottomBinding
import com.example.designtask.model.Grid
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomFragment : BottomSheetDialogFragment() {

    lateinit var binding: FragmentBottomBinding

    lateinit var adapter: GridAdapter
    lateinit var showButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomBinding.inflate(layoutInflater)


        setUpRecyclerView()
//        setUpButton()
        return binding.root
    }
    fun setUpRecyclerView(){

        adapter = GridAdapter(mutableListOf(
            Grid(R.drawable.hi , "Greetings" , "25 coins"),
            Grid(R.drawable.boom , "Boom" , "15 coins"),
            Grid(R.drawable.love , "Big love" , "45 coins"),
            Grid(R.drawable.oh , "Surprise" , "25 coins"),
            Grid(R.drawable.oh , "Surprise" , "25 coins"),
            Grid(R.drawable.oh , "Surprise" , "25 coins"),
            Grid(R.drawable.oh , "Surprise" , "25 coins"),
            Grid(R.drawable.oh , "Surprise" , "25 coins"),
        ))
        binding.gridRv.adapter = adapter
        binding.gridRv.layoutManager = GridLayoutManager(requireContext() , 2 , GridLayoutManager.HORIZONTAL ,false)
    }
    @SuppressLint("SuspiciousIndentation")
    fun setUpButton(){
        showButton.setOnClickListener {
            Log.d("why" , "clicked")
        val dialog = BottomFragment()
            dialog.show(parentFragmentManager , "bottom")
            dismiss()
        }
    }
}