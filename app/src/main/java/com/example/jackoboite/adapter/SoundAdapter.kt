package com.example.jackoboite.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jackoboite.R

class SoundAdapter: RecyclerView.Adapter<SoundAdapter.SoundHolder>() {
    class SoundHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.sound_name)
        val image: ImageView = itemView.findViewById(R.id.sound_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundHolder {
        val view = LayoutInflater.from(parent.context) .inflate(R.layout.sound_item, parent, false)
        return SoundHolder(view)
    }

    override fun onBindViewHolder(holder: SoundHolder, position: Int) {
        val sound = list.get(position)
        holder.itemView.tag = sound.id


        holder.image.setOnClickListener {
            val id = view.tag as Int

        }
        holder.name.text = "Sound"
    }
    override fun getItemCount(): Int {
        return 10
    }
}



