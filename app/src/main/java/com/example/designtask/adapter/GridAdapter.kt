package com.example.designtask.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.designtask.databinding.GridLayoutItemBinding
import com.example.designtask.model.Grid

class GridAdapter(
    var list: List<Grid>
):RecyclerView.Adapter<GridAdapter.GridViewHolder>() {
    inner class GridViewHolder(val binding: GridLayoutItemBinding): ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
    val binding = GridLayoutItemBinding.inflate(LayoutInflater.from(parent.context) , parent ,false)
        return GridViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val item = list[position]
        holder.binding.apply {
            gridItemIv.setImageResource(item.image)
            gridItemTv.text = item.name
            gridItemPrice.text = item.price
        }
    }

    override fun getItemCount(): Int = list.size
}