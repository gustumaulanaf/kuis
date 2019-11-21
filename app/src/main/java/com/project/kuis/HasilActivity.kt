package com.project.kuis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.project.kuis.model.dblogin.User
import com.project.kuis.model.dblogin.UserDatabase
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {
    lateinit var userDatabase: UserDatabase
    lateinit var listuser: List<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
        userDatabase = UserDatabase.getInstance(this)
        listuser = userDatabase.userDao()
            .login(SharedPrefUtil.getString("nopresensi")!!, SharedPrefUtil.getString("password")!!)
        val skorAkhir = intent.getStringExtra("skorAkhir")
        tvSkorAkhir.setText(skorAkhir!!.toString())
        if (skorAkhir.toInt() <= 50) {
            tvSkorAkhir.setTextColor(ContextCompat.getColor(this, R.color.merah))
        } else {
            tvSkorAkhir.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
        }
        if (skorAkhir.toInt() > listuser.get(0).highScore!!) {
            userDatabase.userDao()
                .updateHighScore(skorAkhir.toInt(), SharedPrefUtil.getString("nopresensi")!!)
        }
        btHome.setOnClickListener {
            finish()
        }
    }
}
