package com.example.lektion_4_upp8_class


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lektion_4_upp8_class.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val displayUser = binding.displayUser

        displayUser.text = intent.getStringArrayExtra("key_userList").toString()


    }








}