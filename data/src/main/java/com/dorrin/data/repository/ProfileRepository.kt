package com.dorrin.data.repository

import androidx.lifecycle.Observer
import com.dorrin.data.dao.ProfileDao
import com.dorrin.data.models.Profile
import dagger.Lazy
import javax.inject.Inject

class ProfileRepository : GenericRepository<Profile> {
  @Inject
  internal lateinit var profileDaoLazy: Lazy<ProfileDao>

  private val profileDao get() = profileDaoLazy.get()

  private var _profiles = listOf<Profile>()
  val profiles: List<Profile> get() = _profiles

  private var observers = mutableListOf<Observer<List<Profile>>>()

  override fun getAll(): List<Profile> = profileDao.getAll() // todo get drugs too

  override fun getOneById(id: Long): Profile {
    val profile = profileDao.getOneById(id)
    // todo get drugs too
    return profile
  }

  override fun insertOne(item: Profile) {
    profileDao.insertOne(item)
    onChanged(getAll())
  }

  override fun insertMany(items: List<Profile>) {
    profileDao.insertMany(*items.toTypedArray())
    onChanged(getAll())
  }

  override fun deleteOne(item: Profile) {
    profileDao.deleteOne(item)
    onChanged(getAll())
  }

  override fun deleteMany(items: List<Profile>) {
    profileDao.deleteMany(*items.toTypedArray())
    onChanged(getAll())
  }

  override fun updateOne(item: Profile) {
    profileDao.updateOne(item)
    onChanged(getAll())
  }

  override fun updateMany(items: List<Profile>) {
    profileDao.updateMany(*items.toTypedArray())
    onChanged(getAll())
  }

  override fun addObserver(observer: Observer<List<Profile>>) {
    observers.add(observer)
  }

  override fun removeObserver(observer: Observer<List<Profile>>) {
    observers.remove(observer)
  }

  override fun onChanged(value: List<Profile>) {
    _profiles = value
    observers.forEach { it.onChanged(this.profiles) }
  }
}