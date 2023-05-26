package com.example.communityproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    var count = 0
//    lateinit var textView: TextView
//    lateinit var incrbtn: Button
//    lateinit var decrbtn: Button

    lateinit var name: EditText
    lateinit var passwd: EditText
    lateinit var log: Button

    var user: String = " "
    var password: String = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.uname)
        passwd = findViewById(R.id.pwd)
        log = findViewById(R.id.logbtn)

        log.setOnClickListener {
            user = name.text.toString()
            password = passwd.text.toString()

            if (user != "" && password != "") {
                if (user == "puja") {
                    if (password == "4491") {
                        startActivity(Intent(this, HomeActivity::class.java))
                    } else {
                        Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Invalid Username", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "please Enter credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
//        textView = findViewById(R.id.text)
//        incrbtn = findViewById(R.id.incr_btn)
//        decrbtn = findViewById(R.id.decr_btn)
//        textView.text = count.toString()
//
//        incrbtn.setOnClickListener {
//            count++
//            textView.text = count.toString()
//        }
//        decrbtn.setOnClickListener {
//            count-=1
//            textView.text = count.toString()
//        }