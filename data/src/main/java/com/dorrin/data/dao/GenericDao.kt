package com.dorrin.data.dao

import androidx.room.Dao

@Dao
interface GenericDao<T> {
  fun getAll(): List<T>

  fun getOneById(id: Long): T

  fun insertOne(item: T)

  fun insertMany(vararg item: T)

  fun deleteOne(item: T)

  fun deleteMany(vararg item: T)

  fun updateOne(item: T)

  fun updateMany(vararg item: T)
}