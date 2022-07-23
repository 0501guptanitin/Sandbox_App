package com.example.sandbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        this.setTitle("Home")

//        // switch Button
//        switch_1.setOnCheckedChangeListener { compoundButton, onSwitch ->
//            if (onSwitch) {
//                // switch_1.setBackgroundColor(Color.BLUE)
//            } else {
//                // switch_1.setBackgroundColor(Col}
//            }
//            // loadFragment(HomeFragment())
//
//
//        }
        setCurrentFragment(HomeFragment())
        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    setCurrentFragment(HomeFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.nav_bell -> {
                    setCurrentFragment(NotificationFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.nav_subscription -> {
                    setCurrentFragment(SubscriptionFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.nav_resurce -> {
                    setCurrentFragment(ResourceFragment())
                    return@setOnNavigationItemReselectedListener
                }

            }
        }
    }


    private  fun setCurrentFragment(fragment: androidx.fragment.app.Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    // Menu Function
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_search -> {
                Toast.makeText(this, "Search what you want", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menu_btn1 -> {
                Toast.makeText(this, "Home Page", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menu_setting -> {
                Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menu_help -> {
                Toast.makeText(this, "Take Help", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}