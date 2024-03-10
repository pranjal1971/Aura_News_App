package com.deva.auranewsapp.Model

import com.deva.auranewsapp.Model.Article

data class New_Response(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)