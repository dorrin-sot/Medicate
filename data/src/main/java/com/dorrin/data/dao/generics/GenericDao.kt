package com.dorrin.data.dao.generics

import com.dorrin.data.dao.crud.Deletable
import com.dorrin.data.dao.crud.Gettable
import com.dorrin.data.dao.crud.Insertable
import com.dorrin.data.dao.crud.Updatable

internal interface GenericDao<T> :
  Gettable<T>, Insertable<T>, Updatable<T>, Deletable<T>