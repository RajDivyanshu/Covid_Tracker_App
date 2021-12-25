package com.kotlinninja.covidtracker

import com.google.gson.annotations.SerializedName
import java.util.*

data class CovidData(

     val positiveIncrease: Date,
     val dataChecked:Int,
     val negativeIncrease:Int,
     val deathIncrease:Int,
     val state:String,

     )
// @SerializeName- mapping of json key to the variable that we want to map it to in out data