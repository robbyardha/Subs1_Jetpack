package com.ardhacodes.subs1_jetpack.ui.detail

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ardhacodes.subs1_jetpack.R
import com.ardhacodes.subs1_jetpack.data.MovieTvEntity
import com.ardhacodes.subs1_jetpack.databinding.ActivityDetailMovieTvBinding
import com.ardhacodes.subs1_jetpack.databinding.ContentDetailMovieTvBinding
import com.ardhacodes.subs1_jetpack.ui.movie.MovieViewModel
import com.ardhacodes.subs1_jetpack.utils.Helper.EXTRA_MOVIE
import com.ardhacodes.subs1_jetpack.utils.Helper.EXTRA_TV_SHOW
import com.ardhacodes.subs1_jetpack.utils.Helper.setImageGlide

class DetailMovieTvActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_MOV = "extra_mov"
        const val EXTRA_CATEGORY = "extra_cat"
    }

    private lateinit var detailbinding : ActivityDetailMovieTvBinding
    private lateinit var result: MovieTvEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detailbinding = ActivityDetailMovieTvBinding.inflate(layoutInflater)
        var view = detailbinding.root
        setContentView(view)

        val viewmodel = ViewModelProvider(this@DetailMovieTvActivity, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]
        val ex_id_mov_tv = intent.getStringExtra(EXTRA_MOV)
        val ex_category = intent.getStringExtra(EXTRA_CATEGORY)

        if(ex_category.equals(EXTRA_MOVIE, ignoreCase = true)){
            ex_id_mov_tv?.let {
                viewmodel.setMovieById(it)
            }
            result = viewmodel.getMovie()!!
        }

        else if (ex_category.equals(EXTRA_TV_SHOW, ignoreCase = true)){
            ex_id_mov_tv?.let {
                viewmodel.setTvShowById(it)
            }
            result = viewmodel.getTvShow()!!
        }

        var titlebinding = detailbinding.tvTitle
        titlebinding.text = result.title

        detailbinding.tvTitle.text = result.title
        detailbinding.tvGenre.text = result.genre
        detailbinding.tvYear.text = "Release : ${result.yearrelease}"
        detailbinding.tvScore.text = "Score : ${result.score}"
        detailbinding.tvDuration.text = "Duration : ${result.duration}"
        detailbinding.tvOverview.text = result.overview
        setImageGlide(this@DetailMovieTvActivity, result.poster, detailbinding.ivPoster)

//        val actionBar = supportActionBar
//        actionBar!!.title = "Detail"
//        actionBar.setDisplayHomeAsUpEnabled(true)

//        setContentView(activityDetailContentBinding.root)
//        setSupportActionBar(findViewById(R.id.toolbar))
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        val adapter = DetailMovieTvAdapter()


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}