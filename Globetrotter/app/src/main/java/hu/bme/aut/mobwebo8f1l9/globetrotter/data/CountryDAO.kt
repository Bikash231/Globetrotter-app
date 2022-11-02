package hu.bme.aut.mobwebo8f1l9.globetrotter.data

import androidx.room.*


@Dao
interface CountryDAO {
    @Query("SELECT * FROM countries")
    fun getAllCountries():List<CountryData>
    @Insert
    fun insertCountry(countrydata:CountryData)
    @Delete
    fun deleteCountry(countrydata: CountryData)
    @Update
    fun updateCountry(countryData: CountryData)


}