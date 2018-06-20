package com.fefe.mystationalyaac.data.api

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiModule {
    @Singleton
    @Provides
    fun provideApi() : MyApi =
            Retrofit.Builder()
                    .baseUrl("")
                    .build()
                    .create(MyApi::class.java)
}