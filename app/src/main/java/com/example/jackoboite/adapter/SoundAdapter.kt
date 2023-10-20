package com.example.jackoboite.adapter

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jackoboite.R

class SoundAdapter: RecyclerView.Adapter<SoundAdapter.SoundHolder>() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var view: View
    class SoundHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.sound_name)
        val button : Button = itemView.findViewById(R.id.playButton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundHolder {
        val view = LayoutInflater.from(parent.context) .inflate(R.layout.sound_item, parent, false)
        return SoundHolder(view)
    }

    override fun onBindViewHolder(holder: SoundHolder, position: Int) {
        mediaPlayer = MediaPlayer.create(this, R.raw.son1)
        view.setOnClickListener(){
            mediaPlayer.start()
        }
    }
    override fun getItemCount(): Int {
        return 10
    }
}



