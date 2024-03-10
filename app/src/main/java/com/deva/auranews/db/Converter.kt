package com.deva.auranews.db

import androidx.room.TypeConverter

import com.deva.auranews.Model.Source


class Converter {
    @TypeConverter
    fun fromSource(source: Source):String{
        return  source.name
    }
    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name,name)
    }

}