package com.gl.kev.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "photo")
data class Photo(
    @PrimaryKey val id: Int,
    val albumId: Int,
    var title: String,
    var url: String,
    var thumbnailUrl: String) {



}