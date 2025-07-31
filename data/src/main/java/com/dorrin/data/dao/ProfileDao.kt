package com.dorrin.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.dorrin.data.dao.generics.GenericDao
import com.dorrin.data.models.Profile

@Dao
interface ProfileDao: GenericDao<Profile> {
  @Query("select * from profiles")
  override fun getAll(): List<Profile>

  @Query("select * from profiles where id = :id limit 1")
  override fun getOneById(id: Long): Profile

  @Insert
  override fun insertOne(profile: Profile)

  @Insert
  override fun insertMany(vararg profile: Profile)

  @Delete
  override fun deleteOne(profile: Profile)

  @Delete
  override fun deleteMany(vararg profile: Profile)

  @Update
  override fun updateOne(profile: Profile)

  @Update
  override fun updateMany(vararg profile: Profile)
}