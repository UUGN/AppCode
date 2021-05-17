package com.example.checkme.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.checkme.R
import com.example.checkme.fragment.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val bottomNavigationView : BottomNavigationView by lazy { findViewById(R.id.bottomNavigationMenuBar )}
    private val homeFragment = HomeFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replace_Fragment(homeFragment)
    }

    private fun replace_Fragment(fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer , fragment)
            .commit()
    }
}