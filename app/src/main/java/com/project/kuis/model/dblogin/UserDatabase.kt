package com.project.kuis.model.dblogin

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        internal var INSTANCE: UserDatabase? = null
        fun getInstance(context: Context): UserDatabase {
            synchronized(UserDatabase::class.java) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase::class.java,
                        "user-db"
                    ).allowMainThreadQueries().build()
                }
            }
            return INSTANCE!!
        }
    }

    fun destroyInstance() {
        INSTANCE = null
    }
}