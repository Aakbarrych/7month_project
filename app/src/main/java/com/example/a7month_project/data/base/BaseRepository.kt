package com.example.a7month_project.data.base

import com.example.a7month_project.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseRepository {

    protected fun <T> doRequest(request: suspend () -> T) = flow{
            emit(Resource.Loading())
            try {
                emit(Resource.Success(request()))
            } catch (e: Exception){
                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
}