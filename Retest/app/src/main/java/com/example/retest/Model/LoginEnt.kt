package com.example.retest.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LoginEnt(@PrimaryKey var user:String,var password:String,var phone:String)
