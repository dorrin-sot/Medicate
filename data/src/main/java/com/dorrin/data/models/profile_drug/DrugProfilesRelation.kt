package com.dorrin.data.models.profile_drug

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation
import com.dorrin.data.models.Drug
import com.dorrin.data.models.Profile

@Entity(tableName = DrugProfilesRelation.TABLE_NAME)
data class DrugProfilesRelation(
  @Embedded val drug: Drug,
  @Relation(
    parentColumn = "drugId",
    entityColumn = "profileUsername",
    associateBy = Junction(ProfileDrugCrossRef::class)
  )
  val profiles: List<Profile>
) {
  companion object {
    const val TABLE_NAME = "drug-profiles-ref"
  }
}
