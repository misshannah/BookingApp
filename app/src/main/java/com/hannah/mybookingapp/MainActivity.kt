package com.hannah.mybookingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addListingsBtn.setOnClickListener {
            val openAddListingsIntent = Intent(this, AddListings::class.java)
            startActivity(openAddListingsIntent)
        }
        viewListingsBtn.setOnClickListener {
            val openViewListingsIntent = Intent(this, BookingsAvailable::class.java)
            startActivity(openViewListingsIntent)
        }
    }
}


