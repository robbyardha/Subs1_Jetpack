package com.ardhacodes.subs1_jetpack.ui.tv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ardhacodes.subs1_jetpack.R
import com.ardhacodes.subs1_jetpack.databinding.FragmentTvBinding
import com.ardhacodes.subs1_jetpack.utils.MoviesTvDataDummy


class TvFragment : Fragment() {

    lateinit var fragmentTvBinding : FragmentTvBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentTvBinding = FragmentTvBinding.inflate(inflater,container,false)
        return fragmentTvBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val courses = MoviesTvDataDummy.DataTvShow()
            val adapter = TvAdapter()
            adapter.setTv(courses)
            with(fragmentTvBinding.rvTv) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }
}