package com.dorrin.data.dao.crud

internal interface Deletable<T> {
  fun deleteOne(item: T)
  fun deleteMany(vararg item: T)
}