package com.dorrin.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = Profile.TABLE_NAME)
data class Profile(
  @PrimaryKey val username: String,
  val displayName: String?,
) {
  private var _drugs = mutableListOf<Drug>()

  val drugs: List<Drug> get() = _drugs

  fun addDrug(drug: Drug) = _drugs.add(drug)

  fun removeDrug(drug: Drug) = _drugs.remove(drug)

  fun updateDrug(index: Int, drug: Drug) = _drugs.set(index, drug)

  companion object {
    const val TABLE_NAME = "profiles"
  }
}
