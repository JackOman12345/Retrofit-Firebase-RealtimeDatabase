package com.example.myapplication.Retrofit

import com.example.myapplication.models.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}