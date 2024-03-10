package com.deva.auranews.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.deva.auranews.NewsActivity

import com.deva.auranews.R

class SavedNewsFragment :Fragment(R.layout.fragment_saved_news) {
    lateinit var viewModel: NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=(activity as NewsActivity).viewModel
    }
}