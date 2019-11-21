package com.project.kuis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_video.*

class ListVideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_video)
        title = "Video"
        btVideo1.setOnClickListener {
            val intent = Intent(this,VideoActivity::class.java)
            intent.putExtra("noVideo",1)
            startActivity(intent)
        }
        btVideo2.setOnClickListener {
            val intent = Intent(this,VideoActivity::class.java)
            intent.putExtra("noVideo",2)
            startActivity(intent)

        }
        btVideo3.setOnClickListener {
            val intent = Intent(this,VideoActivity::class.java)
            intent.putExtra("noVideo",3)
            startActivity(intent)

        }
    }
}
