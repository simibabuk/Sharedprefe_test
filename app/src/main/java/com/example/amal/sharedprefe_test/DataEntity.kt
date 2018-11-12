package com.example.amal.sharedprefe_test


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "authers")
private
data class Student(
        @PrimaryKey
        var id:Long?,

        @ColumnInfo(name = "uuid")
        var fullName: String,

        @ColumnInfo(name = "result")
        var result:Int
)