package com.dorrin.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.dorrin.data.dao.generics.GenericRelationDao
import com.dorrin.data.models.profile_drug.ProfileDrugsRelation

@Dao
internal interface ProfileDrugsDao : GenericRelationDao<ProfileDrugsRelation> {
  @Query("select * from `profile-drugs-ref` where id = :id")
  override fun getAllByRightId(id: Long): List<ProfileDrugsRelation>

  @Query("select * from `drug-profiles-ref` where id = :id")
  override fun getAllByLeftId(id: Long): List<ProfileDrugsRelation>

  @Insert
  override fun insertOne(item: ProfileDrugsRelation)

  @Insert
  override fun insertMany(vararg item: ProfileDrugsRelation)

  @Delete
  override fun deleteOne(item: ProfileDrugsRelation)

  @Delete
  override fun deleteMany(vararg item: ProfileDrugsRelation)

  @Update
  override fun updateOne(item: ProfileDrugsRelation)

  @Update
  override fun updateMany(vararg item: ProfileDrugsRelation)
}