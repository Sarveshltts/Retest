package com.example.retest.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase
import com.example.retest.Model.LoginEnt

@Dao
interface logindao {
    @Insert()
    fun insData(log:LoginEnt) :Boolean
    @Query("Select * from LoginEnt where user==:un and password==:pass")
    fun valuser(un:String,pass:String):List<LoginEnt>
    @Query("Select * from LoginEnt")
    fun show(log: LoginEnt):List<LoginEnt>
}