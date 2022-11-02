package hu.bme.aut.mobwebo8f1l9.globetrotter.network

import hu.bme.aut.mobwebo8f1l9.globetrotter.data.CountryData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CountryApi {
    @GET("v3.1/name/{name}")
    fun getCountryByName(@Path("name") name: String) : Call<List<CountryData>>
}