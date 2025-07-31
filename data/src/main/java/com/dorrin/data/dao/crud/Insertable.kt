package com.dorrin.data.dao.crud

internal interface Insertable<T> {
  fun insertOne(item: T)
  fun insertMany(vararg item: T)
}