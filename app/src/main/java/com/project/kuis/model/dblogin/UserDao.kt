package com.project.kuis.model.dblogin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM User WHERE noPresensi LIKE :noPresensi AND password LIKE :password")
    fun login(noPresensi: String, password: String): List<User>

    @Insert(onConflict = REPLACE)
    fun register(user: User)

    @Query("UPDATE User SET highScore = :score WHERE noPresensi = :noPresensi")
    fun updateHighScore(score:Int , noPresensi: String)
}