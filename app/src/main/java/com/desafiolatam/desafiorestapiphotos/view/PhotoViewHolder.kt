package com.desafiolatam.desafiorestapiphotos.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.desafiolatam.desafiorestapiphotos.databinding.PhotosListItemBinding
import com.desafiolatam.desafiorestapiphotos.model.Photo
import com.squareup.picasso.Picasso

class PhotoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val binding = PhotosListItemBinding.bind(itemView)

    fun render(photo: Photo) {
        Picasso.get()
            .load(photo.url)
            .into(binding.imageViewPhoto)

        Picasso.get()
            .setIndicatorsEnabled(true)

        binding.textViewTitle.text = photo.title
    }
}