package com.example.navigatorapp.recyclerEcPlayers.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigatorapp.recyclerEcPlayers.jugador
import com.example.navigatorapp.databinding.ItemPlayerBinding

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemPlayerBinding.bind(view)
    @SuppressLint("SetTextI18n")
    fun render(ecPlayer: jugador){
        binding.tvEcPlayerName.text = ecPlayer.playerName
        binding.tvEcPlayerAge.text = "Age: " + ecPlayer.age.toString()
        binding.tvEcPlayerTeam.text = "Team: " + ecPlayer.team
        binding.tvEcPlayerPosition.text = ecPlayer.position
        Glide.with(binding.ivEcPlayer.context).load(ecPlayer.photo).into(binding.ivEcPlayer)
    }
}