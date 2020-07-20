package com.mustaq.hilt_demo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.mustaq.hilt_demo.R
import com.mustaq.hilt_demo.model.DiffUtilsFactsModel
import com.mustaq.hilt_demo.model.PhotosModel

class AdapterFacts : ListAdapter<PhotosModel, FactsViewHolder>(DiffUtilsFactsModel()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactsViewHolder {
        return FactsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_item_facts, parent, false))
    }

    override fun onBindViewHolder(holder: FactsViewHolder, position: Int) {
        val list=getItem(position)
        holder.bind(list)
    }

}