package com.dorrin.data.dao.generics

import com.dorrin.data.dao.crud.Deletable
import com.dorrin.data.dao.crud.GettableRelation
import com.dorrin.data.dao.crud.Insertable
import com.dorrin.data.dao.crud.Updatable

internal interface GenericRelationDao<T> :
  GettableRelation<T>, Insertable<T>, Deletable<T>, Updatable<T>