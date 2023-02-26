package com.example.lektion_4_upp8_class

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lektion_4_upp8_class.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = binding.inputName // EditText
        val age = binding.inputAge   // Number
        val swRememberMe = binding.swRememberMe   //Switch
        //val rememberMeIsChecked: Boolean   // isChecked
        val tvText = binding.texViewIsLate // TextView
        val userList = ArrayList<User>()



            // Switch
            swRememberMe.setOnClickListener{


                val rememberMeIsChecked = swRememberMe.isChecked.toString()
                swRememberMe.text = rememberMeIsChecked

            }
        binding.registerButton.setOnClickListener{

            val user = User(name.text.toString(), age.text.toString().toInt() , swRememberMe.text.toString().toBoolean())
            userList.add(user)
            println(userList)

            val intentNavigate = Intent(this, LoginActivity:: class.java)
                intent.putExtra("key_userList", userList)
            startActivity(intentNavigate)

        }




    }
}