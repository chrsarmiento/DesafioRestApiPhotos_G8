package com.desafiolatam.desafiorestapiphotos.retrofit

import com.desafiolatam.desafiorestapiphotos.model.Photo
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("/photos")
    suspend fun getAllPhotos(): Response<ArrayList<Photo>>

}