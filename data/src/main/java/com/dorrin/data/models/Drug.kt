package com.dorrin.data.models

import java.time.ZonedDateTime
import kotlin.time.Duration

data class Drug(
  val id: Long,
  val name: String,
  val startTime: ZonedDateTime,
  val frequency: Duration,
  val notes: String? = null
)