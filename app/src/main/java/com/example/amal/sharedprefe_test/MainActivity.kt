package com.example.amal.sharedprefe_test

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pf=this.getSharedPreferences("simi",0)
        val edit=pf.edit()
        edit.putString("1","2")
        edit.putString("3","4")
        edit.commit()
        val number=pf.getString("2","3")
        Log.d("simi",number);
        val number1=pf.getString("1","3")
        Log.d("simi",number1);
       kotlin.run {  }


    }
}
