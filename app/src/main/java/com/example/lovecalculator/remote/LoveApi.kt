package com.example.lovecalculator.remote

import com.example.lovecalculator.remote.LoveModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {

    @GET("getPercentage")
    fun getPercentage(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header ("X-RapidAPI-Key") key:String = "1130f5e41emsha2b0bcc88036b1fp105d64jsn74c616e1433d",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.rapidapi.com"
    ) : Call<LoveModel>
}