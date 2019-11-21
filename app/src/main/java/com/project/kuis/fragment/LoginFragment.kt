package com.project.kuis.fragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.project.kuis.HomeActivity

import com.project.kuis.R
import com.project.kuis.SharedPrefUtil
import com.project.kuis.model.dblogin.User
import com.project.kuis.model.dblogin.UserDatabase
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_register.view.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {
    internal lateinit var view: View
    internal lateinit var userDatabase: UserDatabase
    internal lateinit var user: List<User>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userDatabase = UserDatabase.getInstance(context!!)
        view = inflater.inflate(R.layout.fragment_login, container, false)
        view.btLogin.setOnClickListener {
            if (!view.etPassword.text.toString().isEmpty() && !view.etPresensi.text.toString().isEmpty()) {
                user = userDatabase.userDao()
                    .login(view.etPresensi.text.toString(), view.etPassword.text.toString())
                if (user.size == 0) {
                    Toast.makeText(context!!, "Login Gagal", Toast.LENGTH_SHORT).show()
                } else {
                    SharedPrefUtil.saveBoolean("isLogin", true)
                    SharedPrefUtil.saveInt("highScore", user.get(0).highScore!!)
                    SharedPrefUtil.saveString("nopresensi", view.etPresensi.text.toString())
                    SharedPrefUtil.saveString("password", view.etPassword.text.toString())
                    startActivity(Intent(context!!, HomeActivity::class.java))
                    activity!!.finish()
                }
            }
        }
        return view
    }


}
