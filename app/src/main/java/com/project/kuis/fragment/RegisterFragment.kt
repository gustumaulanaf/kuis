package com.project.kuis.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.project.kuis.R
import com.project.kuis.SharedPrefUtil
import com.project.kuis.model.dblogin.User
import com.project.kuis.model.dblogin.UserDatabase
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.view.*

/**
 * A simple [Fragment] subclass.
 */
class RegisterFragment : Fragment() {
    internal lateinit var view: View
    internal lateinit var userDatabase: UserDatabase
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userDatabase = UserDatabase.getInstance(context!!)
        view = inflater.inflate(R.layout.fragment_register, container, false)
        view.btDaftar.setOnClickListener {
            if (!view.etNewNama.text.toString().isEmpty() && !view.etNewPassword.text.toString().isEmpty() && !view.etNewPresensi.text.toString().isEmpty())
            {
                var user = User()
                user.highScore = 0
                user.nama = view.etNewNama.text.toString()
                user.noPresensi = view.etNewPresensi.text.toString()
                user.password = view.etNewPassword.text.toString()
                userDatabase.userDao().register(user)
                var listUser:List<User>?=null
                listUser = userDatabase.userDao().login(etNewPresensi.text.toString(),etNewPassword.text.toString())
                if (listUser.size>0){
                    Toast.makeText(context!!,"Berhasil Mendaftar Silahkan Kembali Ke Menu Login",Toast.LENGTH_SHORT).show()
                    SharedPrefUtil.saveString("nama",view.etNewNama.text.toString())
                    SharedPrefUtil.saveString("nopresensi",view.etNewPresensi.text.toString())
                    SharedPrefUtil.saveString("password",view.etNewPassword.text.toString())
                    SharedPrefUtil.saveInt("highScore",0)
                }
            }
        }

        return view
    }


}
