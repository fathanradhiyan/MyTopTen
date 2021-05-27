package com.example.mytopten

import android.annotation.SuppressLint
import android.view.*
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_card.view.*

class PlayerAdapter (
    var players: List<Player>,
    private val listener: OnItemClickListener
): RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>(){
    inner class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position:Int = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return PlayerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return players.size
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.itemView.apply {
            val photo = players[position].photo
            Glide.with(context).load(photo).into(iv_photo)
            tv_name.text = players[position].name
            tv_team.text = players[position].team
            if (players[position].isActive){
                tv_status.text = context.getString(R.string.active)
                tv_status.background = resources.getDrawable(R.color.active)
            }
            else{
                tv_status.text = context.getString(R.string.inactive)
            }
        }
    }
}

