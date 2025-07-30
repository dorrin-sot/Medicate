package com.dorrin.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dorrin.data.dao.DrugDao
import com.dorrin.data.dao.ProfileDao
import com.dorrin.data.models.Drug
import com.dorrin.data.models.Profile
import com.dorrin.data.models.profile_drug.DrugProfilesRelation
import com.dorrin.data.models.profile_drug.ProfileDrugsRelation

@Database(
  entities = [
    Drug::class,
    Profile::class,
    DrugProfilesRelation::class,
    ProfileDrugsRelation::class
  ],
  version = 1
)
internal abstract class MedicateDatabase : RoomDatabase() {
  abstract fun drugDao(): DrugDao
  abstract fun profileDao(): ProfileDao
}