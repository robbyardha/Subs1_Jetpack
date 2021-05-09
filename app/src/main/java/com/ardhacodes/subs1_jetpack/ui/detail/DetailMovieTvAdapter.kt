package com.ardhacodes.subs1_jetpack.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardhacodes.subs1_jetpack.data.MovieTvEntity
class DetailMovieTvAdapter: RecyclerView.Adapter<DetailMovieTvAdapter.ModuleViewHolder>(){
    private val listmovtv = ArrayList<MovieTvEntity>()

    fun setModules(modules: List<MovieTvEntity>?) {
        if (modules == null) return
        this.listmovtv.clear()
        this.listmovtv.addAll(modules)
    }
}

//class DetailMovieTvAdapter : RecyclerView.Adapter<DetailMovieTvAdapter.ModuleViewHolder>() {
//
//
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): DetailMovieTvAdapter.ModuleViewHolder {
//        val itemModuleListBinding = ItemsModuleListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ModuleViewHolder(itemModuleListBinding)
//    }

//    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
//        val module = listModules[position]
//        holder.bind(module)
//    }

//    override fun getItemCount(): Int {
//        return listModules.size
//    }