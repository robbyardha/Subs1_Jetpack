package com.ardhacodes.subs1_jetpack.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardhacodes.subs1_jetpack.data.MovieTvEntity

class DetailMovieTvAdapter : RecyclerView.Adapter<DetailMovieTvAdapter.ModuleViewHolder>() {
    private val listModules = ArrayList<MovieTvEntity>()

    fun setModules(modules: List<MovieTvEntity>?) {
        if (modules == null) return
        this.listModules.clear()
        this.listModules.addAll(modules)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DetailMovieTvAdapter.ModuleViewHolder {
        val itemModuleListBinding = ItemsModuleListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModuleViewHolder(itemModuleListBinding)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val module = listModules[position]
        holder.bind(module)
    }

    override fun getItemCount(): Int {
        return listModules.size
    }
}