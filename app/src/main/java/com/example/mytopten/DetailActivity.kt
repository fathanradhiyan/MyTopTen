package com.example.mytopten

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_PLAYER_PHOTO = "extra player photo"
        const val EXTRA_PLAYER_NAME = "extra player name"
        const val EXTRA_PLAYER_TEAM = "extra player team"
        const val EXTRA_PLAYER_STATUS = "extra player status"
        const val EXTRA_PLAYER_DETAIL = "extra player detail"
    }
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val playerPhoto = intent.getIntExtra(EXTRA_PLAYER_PHOTO, 0)
        val playerName = intent.getStringExtra(EXTRA_PLAYER_NAME)
        val playerTeam = intent.getStringExtra(EXTRA_PLAYER_TEAM)
        val playerDetail = intent.getStringExtra(EXTRA_PLAYER_DETAIL)
        val playerStatus = intent.getBooleanExtra(EXTRA_PLAYER_STATUS, false)

        Glide.with(applicationContext).load(playerPhoto).into(detail_photo)
        detail_name.text = playerName
        detail_team.text = playerTeam
        detail_detail.text = playerDetail
        if (playerStatus){
            detail_status.text = getString(R.string.active)
            detail_status.background = resources.getDrawable(R.color.active)
        }else{
            detail_status.text = getString(R.string.inactive)
            detail_status.background = resources.getDrawable(R.color.inactive)
        }

    }
}