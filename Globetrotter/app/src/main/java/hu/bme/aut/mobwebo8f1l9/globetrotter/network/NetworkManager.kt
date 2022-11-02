package hu.bme.aut.mobwebo8f1l9.globetrotter.network

import hu.bme.aut.mobwebo8f1l9.globetrotter.data.CountryData
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object NetworkManager {
    private const val SERVICE_URL = "https://restcountries.com/"
    val retrofit = Retrofit.Builder()
        .baseUrl(SERVICE_URL).addConverterFactory(GsonConverterFactory.create())
        .build()

    val countryAPI = retrofit.create(CountryApi::class.java)

    fun getCountryByName(name : String): Call<List<CountryData>> {
        return countryAPI.getCountryByName(name)
    }
}