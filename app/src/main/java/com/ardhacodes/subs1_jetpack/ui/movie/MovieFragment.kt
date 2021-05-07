package com.ardhacodes.subs1_jetpack.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ardhacodes.subs1_jetpack.R
import com.ardhacodes.subs1_jetpack.databinding.FragmentMovieBinding
import com.ardhacodes.subs1_jetpack.utils.MoviesTvDataDummy

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MovieFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MovieFragment : Fragment() {
    private lateinit var fragmentMovieBind: FragmentMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (activity != null) {
            val movie = MoviesTvDataDummy.DataMovies()
            val movieAdapter = MovieAdapter()
            movieAdapter.setMovies(movie)
            with(fragmentMovieBind.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentMovieBind = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBind.root
    }


}