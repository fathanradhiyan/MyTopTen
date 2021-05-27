package com.example.mytopten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_card.*

class MainActivity : AppCompatActivity(), PlayerAdapter.OnItemClickListener {

    private lateinit var rvMain: RecyclerView
    private var list: ArrayList<Player> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain = findViewById(R.id.rv_main)
        rvMain.setHasFixedSize(true)

        list.addAll(PlayersData.listData);

        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMain.layoutManager = LinearLayoutManager(this)
        val playerAdapter = PlayerAdapter(list, this)
        rvMain.adapter = playerAdapter
    }

    override fun onItemClick(position: Int) {
//        Toast.makeText(this, list[position].photo, Toast.LENGTH_SHORT).show()
        val toDetail = Intent(this@MainActivity, DetailActivity::class.java)
        toDetail.putExtra(DetailActivity.EXTRA_PLAYER_PHOTO, list[position].photo)
        toDetail.putExtra(DetailActivity.EXTRA_PLAYER_NAME, list[position].name)
        toDetail.putExtra(DetailActivity.EXTRA_PLAYER_TEAM, list[position].team)
        toDetail.putExtra(DetailActivity.EXTRA_PLAYER_STATUS, list[position].isActive)
        toDetail.putExtra(DetailActivity.EXTRA_PLAYER_DETAIL, list[position].detail)
        startActivity(toDetail)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        toAbout(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun toAbout(selectedItem: Int) {
        when(selectedItem) {
            R.id.mi_about -> {
                val toAbout = Intent(this@MainActivity, AboutActivity::class.java)
                toAbout.putExtra(AboutActivity.EXTRA_NAME, getString(R.string.creator_name))
                toAbout.putExtra(AboutActivity.EXTRA_EMAIL, getString(R.string.creator_email))
                startActivity(toAbout)
            }
        }
    }
}
