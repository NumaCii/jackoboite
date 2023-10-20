package com.example.jackoboite

import android.media.AsyncPlayer
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.jackoboite.adapter.SoundAdapter
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listButton = findViewById<RecyclerView>(R.id.sound_list)
        listButton.adapter = SoundAdapter()
    }
}