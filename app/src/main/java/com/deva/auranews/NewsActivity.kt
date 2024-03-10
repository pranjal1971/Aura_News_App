package com.deva.auranews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.deva.auranews.Repository.NewsRepository
import com.deva.auranews.databinding.ActivityMainBinding
import com.deva.auranews.db.ArticleDatabase
import com.deva.auranews.ui.NewsViewModel
import com.deva.auranews.ui.NewsViewModelProviderFactory

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel:NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      //  val navHostFragment = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        val navController = findNavController(R.id.newsNavHostFragment)


        // Check if binding is not null before calling setupWithNavController
        NavigationUI.setupWithNavController(binding.bottomNavigationView,navController)

        val newsRepositry=NewsRepository(ArticleDatabase(this))
        val ViewModelProviderFactory=NewsViewModelProviderFactory(newsRepositry)

    }
}

