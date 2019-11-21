package com.project.kuis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_materi.*

class ListMateriActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_materi)
        title ="Materi"
        btPengertian.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra("noMateri", 1)
            startActivity(intent)

        }
        btKarakteristik.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra("noMateri", 2)
            startActivity(intent)

        }
        btSiklus.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra("noMateri", 3)
            startActivity(intent)

        }
        btJenis.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra("noMateri", 4)
            startActivity(intent)
        }
    }
}
