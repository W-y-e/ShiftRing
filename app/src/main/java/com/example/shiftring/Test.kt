package com.example.shiftring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Test : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val drawer: DrawerLayout = findViewById(R.id.drawer_layout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        homeNavView()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean{
//
//        when (item.itemId) {
//            android.R.id.nav_notifications-> supportFragmentManager.beginTransaction().replace(
//                android.R.id.fragment_container,
//                MessageFragment()
//            ).commit()
//            android.R.id.nav_chat -> supportFragmentManager.beginTransaction().replace(
//                android.R.id.fragment_container,
//                ChatFragment()
//            ).commit()
//            android.R.id.nav_profile -> supportFragmentManager.beginTransaction().replace(
//                android.R.id.fragment_container,
//                ProfileFragment()
//            ).commit()
//            android.R.id.nav_notifications -> Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show()
//            android.R.id.nav_send -> Toast.makeText(this, "Send", Toast.LENGTH_SHORT).show()
//        }
//
//        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    private fun homeNavView(){
        val homeNavigationView: NavigationView = findViewById(R.id.nav_view)
        homeNavigationView.setNavigationItemSelectedListener(this)
    }
}
