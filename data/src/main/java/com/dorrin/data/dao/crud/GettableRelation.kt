package com.dorrin.data.dao.crud

internal interface GettableRelation<T> {
  fun getAllByRightId(id: Long): List<T>
  fun getAllByLeftId(id: Long): List<T>
}
