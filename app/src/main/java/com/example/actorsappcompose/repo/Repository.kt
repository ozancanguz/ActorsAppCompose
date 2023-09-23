package com.example.actorsappcompose.repo

import com.example.actorsappcompose.remote.RemoteDataSource
import javax.inject.Inject

class Repository@Inject constructor(remoteDataSource: RemoteDataSource) {


    val remote=remoteDataSource

}