package com.example.practice_app

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("http://192.168.10.153:8000/").addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    val apiInterface by lazy {
        retrofit.create(ApiInterface::class.java)
    }
}