package com.dorrin.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.dorrin.data.models.Drug

@Dao
interface DrugDao: GenericDao<Drug> {
  @Query("select * from drugs")
  override fun getAll(): List<Drug>

  @Query("select * from drugs where id = :id limit 1")
  override fun getOneById(id: Long): Drug

  @Insert
  override fun insertOne(drug: Drug)

  @Insert
  override fun insertMany(vararg drug: Drug)

  @Delete
  override fun deleteOne(drug: Drug)

  @Delete
  override fun deleteMany(vararg drug: Drug)

  @Update
  override fun updateOne(drug: Drug)

  @Update
  override fun updateMany(vararg drug: Drug)
}