package com.example.expense_share_app

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.expense_share_app.databinding.ActivityMyGroupsBinding

class MyGroupsActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMyGroupsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyGroupsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val sizer = intent.getIntExtra("size",0)
        val gname = intent.getStringExtra("group_name")

        binding.button1.text = "${gname}"

        binding.button1.setOnClickListener{
            val intent = Intent(applicationContext, PaymentActivity::class.java)
            intent.putExtra("size_sent", sizer)
            startActivity(intent)
        }

        binding.backButton.setOnClickListener{
            val intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
        }
    }


}