package com.dorrin.data.models.profile_drug

import androidx.room.Entity

@Entity(primaryKeys = ["profileUsername", "drugId"])
internal data class ProfileDrugCrossRef(
  val profileUsername: String,
  val drugId: Long
)