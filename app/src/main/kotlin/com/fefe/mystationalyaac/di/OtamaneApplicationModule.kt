package com.fefe.mystationalyaac.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class OtamaneApplicationModule {

    @Singleton
    @Provides
    fun provideContext(application: Application): Context = application
}
