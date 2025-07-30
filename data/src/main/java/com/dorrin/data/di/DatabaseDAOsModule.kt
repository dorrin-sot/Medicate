package com.dorrin.data.di

import android.content.Context
import androidx.room.Room
import com.dorrin.data.MedicateDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DatabaseDAOsModule {
  @Provides
  @Singleton
  internal fun providesDatabase(@ApplicationContext context: Context): MedicateDatabase =
    Room.databaseBuilder(
      context,
      MedicateDatabase::class.java,
      "medicate-db"
    )
      .fallbackToDestructiveMigration(dropAllTables = true)
      .build()
}