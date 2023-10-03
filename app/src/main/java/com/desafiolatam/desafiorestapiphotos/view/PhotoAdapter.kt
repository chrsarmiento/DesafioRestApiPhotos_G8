package com.desafiolatam.desafiorestapiphotos.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.desafiolatam.desafiorestapiphotos.R
import com.desafiolatam.desafiorestapiphotos.model.Photo

class PhotoAdapter(private val listPhotos: List<Photo>) : RecyclerView.Adapter<PhotoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.photos_list_item, parent,false)
        return PhotoViewHolder(view)
    }

    override fun getItemCount(): Int = listPhotos.size

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val photo = listPhotos[position]
        holder.render(photo)
    }


}