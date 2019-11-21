package com.project.kuis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handler:Handler = Handler()
        handler.postDelayed(object :Runnable{
            override fun run() {
                if (SharedPrefUtil.getBoolean("isLogin")){
                    startActivity(Intent(this@SplashActivity,HomeActivity::class.java))
                    finish()
                }
                else {
                    startActivity(Intent(this@SplashActivity,LoginActivity::class.java))
                    finish()
                }
            }

        },3000)
    }
}
