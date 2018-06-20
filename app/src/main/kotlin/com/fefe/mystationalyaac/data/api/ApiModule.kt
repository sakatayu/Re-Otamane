package com.fefe.mystationalyaac.data.api

import com.fefe.mystationalyaac.data.OtamaneConst
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class ApiModule {
    @Singleton
    @Provides
    fun provideOtamaneApi() : OtamaneApi =
            Retrofit.Builder()
                    .baseUrl(OtamaneConst.Urls.BASE_ANIME_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
                    .create(OtamaneApi::class.java)
}
