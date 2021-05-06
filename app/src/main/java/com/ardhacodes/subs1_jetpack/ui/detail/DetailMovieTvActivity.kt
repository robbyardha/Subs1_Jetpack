package com.ardhacodes.subs1_jetpack.ui.detail

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.ardhacodes.subs1_jetpack.R
import com.ardhacodes.subs1_jetpack.databinding.ActivityDetailMovieTvBinding
import com.ardhacodes.subs1_jetpack.databinding.ContentDetailMovieTvBinding

class DetailMovieTvActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_MOV = "extra_mov"
    }

    private lateinit var detailcontentsbinds : ContentDetailMovieTvBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailContentBinding = ActivityDetailMovieTvBinding.inflate(layoutInflater)
        detailcontentsbinds = activityDetailContentBinding.detailContent

        setContentView(activityDetailContentBinding.root)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}