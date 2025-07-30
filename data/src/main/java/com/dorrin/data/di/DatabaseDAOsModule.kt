package com.dorrin.data.di

import com.dorrin.data.MedicateDatabase
import com.dorrin.data.dao.DrugDao
import com.dorrin.data.dao.ProfileDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DatabaseDAOsModule {
  @Inject
  private lateinit var db: Lazy<MedicateDatabase>

  @Provides
  @Singleton
  fun providesDrugDao(): DrugDao = db.value.drugDao()

  @Provides
  @Singleton
  fun providesProfileDao(): ProfileDao = db.value.profileDao()
}