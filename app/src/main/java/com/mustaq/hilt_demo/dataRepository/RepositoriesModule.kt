package com.mustaq.hilt_demo.dataRepository

import com.mustaq.hilt_demo.dataRepository.DataRepositories
import com.mustaq.hilt_demo.networkCall.ApiServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoriesModule {
    @Provides
    fun provideDataRepo(apiServices: ApiServices): DataRepositories {
        return DataRepositories(apiServices)
    }

}