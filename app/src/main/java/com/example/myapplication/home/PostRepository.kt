package com.example.myapplication.home

import com.example.myapplication.Retrofit.ApiService

class PostRepository(private val apiService: ApiService) {
    suspend fun getPosts() = apiService.getPosts()
}