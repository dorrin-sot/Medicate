package com.dorrin.data.repository

import androidx.lifecycle.Observer

interface GenericRepository<T> : Observer<List<T>> {
  fun getAll(): List<T>
  fun getOneById(id: Long): T
  fun insertOne(item: T)
  fun insertMany(items: List<T>)
  fun deleteOne(item: T)
  fun deleteMany(items: List<T>)
  fun updateOne(item: T)
  fun updateMany(items: List<T>)

  fun addObserver(observer: Observer<List<T>>)
  fun removeObserver(observer: Observer<List<T>>)
}