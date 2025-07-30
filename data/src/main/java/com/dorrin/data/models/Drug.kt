package com.dorrin.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.ZonedDateTime
import kotlin.time.Duration

@Entity(tableName = Drug.TABLE_NAME)
data class Drug(
  @PrimaryKey(autoGenerate = true) val id: Long,
  val name: String,
  val startTime: ZonedDateTime,
  val frequency: Duration,
  val notes: String? = null
) {
  companion object {
    const val TABLE_NAME = "drugs"
  }
}
