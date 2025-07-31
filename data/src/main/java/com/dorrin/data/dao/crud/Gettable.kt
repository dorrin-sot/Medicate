package com.dorrin.data.dao.crud

internal interface Gettable<T> {
  fun getAll(): List<T>
  fun getOneById(id: Long): T
}
