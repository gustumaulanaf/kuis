package com.project.kuis.model.dblogin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    @ColumnInfo(name = "nama")
    var nama: String? = null
    @ColumnInfo(name = "noPresensi")
    var noPresensi: String? = null
    @ColumnInfo(name = "password")
    var password: String? = null
    @ColumnInfo(name = "highScore")
    var highScore: Int? = null
}