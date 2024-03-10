package com.deva.auranews.Repository

import com.deva.auranews.db.ArticleDatabase
import com.deva.auranews.api.RetrofitInstance

class NewsRepository(
    val db:ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode:String,pageNumber:Int)=
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}