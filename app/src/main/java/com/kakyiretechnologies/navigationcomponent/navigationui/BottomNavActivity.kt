package com.kakyiretechnologies.navigationcomponent.navigationui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.kakyiretechnologies.navigationcomponent.R
import com.kakyiretechnologies.navigationcomponent.databinding.ActivityBottomNavBinding

class BottomNavActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBottomNavBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.bottomNavHost)
                    as NavHostFragment


        val navController = navHostFragment.navController

        binding.bottomNav.setupWithNavController(navController)
    }
}