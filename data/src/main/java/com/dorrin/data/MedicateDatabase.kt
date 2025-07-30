package com.dorrin.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dorrin.data.models.Drug
import com.dorrin.data.models.Profile

@Database(entities = [Drug::class, Profile::class], version = 1)
abstract class MedicateDatabase : RoomDatabase()