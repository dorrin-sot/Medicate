package com.dorrin.data.dao.crud

internal interface Updatable<T> {
  fun updateOne(item: T)
  fun updateMany(vararg item: T)
}