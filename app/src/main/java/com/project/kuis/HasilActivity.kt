package com.project.kuis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
        val skorAkhir = intent.getStringExtra("skorAkhir")
        tvSkorAkhir.setText(skorAkhir.toString())
    }
}
