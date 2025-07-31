package com.dorrin.data.models.profile_drug

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation
import com.dorrin.data.models.Drug
import com.dorrin.data.models.Profile

@Entity(tableName = ProfileDrugsRelation.TABLE_NAME)
data class ProfileDrugsRelation(
  @Embedded val profile: Profile,
  @Relation(
    parentColumn = "profileUsername",
    entityColumn = "drugId",
    associateBy = Junction(ProfileDrugCrossRef::class)
  )
  val drugs: List<Drug>
) : GenericRelation<Profile, Drug>(
  left = profile,
  rights = drugs
) {
  companion object {
    const val TABLE_NAME = "profile-drugs-ref"
  }
}
