package com.project.kuis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
     var sharedPrefUtil:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        title = "Menu Utama"
        layoutKuis.setOnClickListener {
            startActivity(Intent(this,KuisActivity::class.java))
        }
        layoutVideo.setOnClickListener {
            startActivity(Intent(this, ListVideoActivity::class.java))

        }
        layoutMateri.setOnClickListener {
            startActivity(Intent(this, ListMateriActivity::class.java))

        }
        layoutContohSoal.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra("noMateri", 5)
            startActivity(intent)
        }
        layoutKeluar.setOnClickListener {
            SharedPrefUtil.saveBoolean("isLogin",false)
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }
    }
}
