package com.kakyiretechnologies.navigationcomponent.navigationui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.kakyiretechnologies.navigationcomponent.R
import com.kakyiretechnologies.navigationcomponent.databinding.ActivityNavigationViewBinding

class NavigationViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navigation_view_nav_host)
                as NavHostFragment

        val navController = navHostFragment.navController

        val appBarConfiguration = AppBarConfiguration(
            //Uncomment the below line of code to allow Top-level destinations
            // setOf(R.id.homeFragment, R.id.chatFragment, R.id.profileFragment),
            navController.graph, //comment this line after allowing Top-level destinations
            binding.drawerLayout,

            )
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
    }
}