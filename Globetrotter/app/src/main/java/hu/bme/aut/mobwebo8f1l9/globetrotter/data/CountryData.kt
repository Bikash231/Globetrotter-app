package hu.bme.aut.mobwebo8f1l9.globetrotter.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.google.gson.Gson
@Entity(tableName = "countries")
data class CountryData(val name: Name,
                       @PrimaryKey val cca3 : String,
                       val flags : Flags)
data class Name(val common:String)
data class Flags(val png:String)

class Converters {
    val gson = Gson();

    @TypeConverter
    fun nameToString(name: Name): String {
        return gson.toJson(name)
    }

    @TypeConverter
    fun stringToName(stringName: String): Name {
        return gson.fromJson(stringName, Name::class.java)
    }

    @TypeConverter
    fun flagsToString(flagsToString: Flags): String {
        return gson.toJson(flagsToString)
    }

    @TypeConverter
    fun stringToFlags(stringFlags: String): Flags {
        return gson.fromJson(stringFlags, Flags::class.java)
    }
}
