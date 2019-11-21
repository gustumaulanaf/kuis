package com.project.kuis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.project.kuis.fragment.LoginFragment
import com.project.kuis.fragment.RegisterFragment
import com.project.kuis.model.dblogin.UserDatabase
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    lateinit var userDatabase: UserDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        userDatabase = UserDatabase.getInstance(this)
        getFragment(LoginFragment())
        tvLogin.setTextColor(ContextCompat.getColor(this,R.color.putih))
        tvLogin.setBackgroundColor(ContextCompat.getColor(this,R.color.colorPrimary))
        tvDaftar.setTextColor(ContextCompat.getColor(this,R.color.hitam))
        tvDaftar.setBackgroundColor(ContextCompat.getColor(this,R.color.putih))
        tvLogin.setOnClickListener {
            getFragment(LoginFragment())
            tvLogin.setTextColor(ContextCompat.getColor(this,R.color.putih))
            tvLogin.setBackgroundColor(ContextCompat.getColor(this,R.color.colorPrimary))
            tvDaftar.setTextColor(ContextCompat.getColor(this,R.color.hitam))
            tvDaftar.setBackgroundColor(ContextCompat.getColor(this,R.color.putih))
        }
        tvDaftar.setOnClickListener {
            getFragment(RegisterFragment())
            tvLogin.setTextColor(ContextCompat.getColor(this,R.color.hitam))
            tvLogin.setBackgroundColor(ContextCompat.getColor(this,R.color.putih))
            tvDaftar.setTextColor(ContextCompat.getColor(this,R.color.putih))
            tvDaftar.setBackgroundColor(ContextCompat.getColor(this,R.color.colorPrimary))
        }
    }
    fun getFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frameForm,fragment).commit()
    }
}
