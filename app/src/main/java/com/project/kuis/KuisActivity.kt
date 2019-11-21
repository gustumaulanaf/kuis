package com.project.kuis

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Toast
import com.project.kuis.model.Soal
import com.project.kuis.model.dblogin.User
import com.project.kuis.model.dblogin.UserDatabase
import kotlinx.android.synthetic.main.activity_kuis.*

class KuisActivity : AppCompatActivity() {
    var skor: Int = 0
    var arr: Int? = null
    var x: Int? = 0
    var jawaban: String? = null
    var soal: Soal = Soal()
    lateinit var userDatabase: UserDatabase
    lateinit var listUser: List<User>
    lateinit var soundBenar:MediaPlayer
    lateinit var soundSalah:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis)
        userDatabase = UserDatabase.getInstance(this)
        listUser = userDatabase.userDao().login(SharedPrefUtil.getString("nopresensi")!!,SharedPrefUtil.getString("password")!!)
        soundBenar = MediaPlayer.create(this,R.raw.benar)
        soundSalah = MediaPlayer.create(this,R.raw.salah)
        tvSkor.setText("" + skor)
        setKontent()
        btSubmit.setOnClickListener {
            cekJawaban()
        }
        
        tvHighScore.setText(listUser.get(0).highScore.toString())
    }

    private fun setKontent() {
        rgPilihan.clearCheck()
        arr = soal.pertanyaan.size
        if (x!! >= arr!!) {
            var jumlahSkor = skor.toString()
            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("skorAkhir", jumlahSkor)
            intent.putExtra("activity", "PilihanGanda")
            startActivity(intent)
            finish()
        } else {
            tvSoal.setText(soal.getPertanyaan(x!!))
            rbA.setText(soal.getPilihanJawaban1(x!!))
            rbB.setText(soal.getPilihanJawaban2(x!!))
            rbC.setText(soal.getPilihanJawaban3(x!!))
            rbD.setText(soal.getPilihanJawaban4(x!!))
            rbE.setText(soal.getPilihanJawaban5(x!!))
            jawaban = soal.getJawabanBenar(x!!)
        }
        x = x!!+1
    }

    private fun cekJawaban() {
        if (rbA.isChecked) {
            if (rbA.text.toString().equals(jawaban)) {
                skor = skor + 5
                tvSkor.setText("" + skor)
                soundBenar.start()
                Toast.makeText(applicationContext, "Jawaban Benar", Toast.LENGTH_SHORT).show()
                setKontent()
            } else {
                tvSkor.setText("" + skor)
                soundSalah.start()
                Toast.makeText(applicationContext, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKontent()
            }
        } else if (rbB.isChecked) {
            if (rbB.text.toString().equals(jawaban)) {
                soundBenar.start()
                skor = skor + 5
                tvSkor.setText("" + skor)
                Toast.makeText(applicationContext, "Jawaban Benar", Toast.LENGTH_SHORT).show()
                setKontent()
            } else {
                soundSalah.start()
                tvSkor.setText("" + skor)
                Toast.makeText(applicationContext, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKontent()
            }
        } else if (rbC.isChecked) {
            if (rbC.text.toString().equals(jawaban)) {
                soundBenar.start()
                skor = skor + 5
                tvSkor.setText("" + skor)
                Toast.makeText(applicationContext, "Jawaban Benar", Toast.LENGTH_SHORT).show()
                setKontent()
            } else {
                soundSalah.start()
                tvSkor.setText("" + skor)
                Toast.makeText(applicationContext, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKontent()
            }
        } else if (rbD.isChecked) {
            if (rbD.text.toString().equals(jawaban)) {
                soundBenar.start()
                skor = skor + 5
                tvSkor.setText("" + skor)
                Toast.makeText(applicationContext, "Jawaban Benar", Toast.LENGTH_SHORT).show()
                setKontent()
            } else {
                soundSalah.start()
                tvSkor.setText("" + skor)
                Toast.makeText(applicationContext, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKontent()
            }
        } else if (rbE.isChecked) {
            if (rbE.text.toString().equals(jawaban)) {
                soundBenar.start()
                skor = skor + 5
                tvSkor.setText("" + skor)
                Toast.makeText(applicationContext, "Jawaban Benar", Toast.LENGTH_SHORT).show()
                setKontent()
            } else {
                soundSalah.start()
                tvSkor.setText("" + skor)
                Toast.makeText(applicationContext, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKontent()
            }
        } else {
            soundSalah.start()
            Toast.makeText(applicationContext, "Jawaban Tidak Boleh Kosong", Toast.LENGTH_SHORT)
                .show()
        }
    }

    override fun onBackPressed() {
        Toast.makeText(applicationContext, "Selesaikan Kuis Terlebih Dahulu", Toast.LENGTH_SHORT)
            .show()
    }
}
