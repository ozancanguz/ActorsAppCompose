package com.example.actorsappcompose.repo

import com.example.actorsappcompose.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject


@ViewModelScoped
class Repository@Inject constructor(remoteDataSource: RemoteDataSource) {


    val remote=remoteDataSource

}