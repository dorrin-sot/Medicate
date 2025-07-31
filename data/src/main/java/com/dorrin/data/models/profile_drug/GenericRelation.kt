package com.dorrin.data.models.profile_drug

abstract class GenericRelation<L, R>(
  val left: L,
  val rights: List<R>
)
