package com.kotlinninja.covidtracker

import retrofit2.Call
import retrofit2.http.GET

interface CovidService {

@GET("us/daily.json")
fun getNationalData():Call<List<CovidData>>


    @GET("states/daily.json") //Annotation is used to attach metadata to our code
    fun getStatesData():Call<List<CovidData>>
}