package com.mustaq.hilt_demo.callResponse

import com.mustaq.hilt_demo.dataRepository.DataRepositories
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object UseCaseModule {
    @Provides
    fun provideUseCase(dataRepositories: DataRepositories): CallResponse {
        return CallResponse(dataRepositories)
    }
}