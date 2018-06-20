package com.fefe.mystationalyaac.data

import com.fefe.mystationalyaac.data.api.ApiModule
import dagger.Module

@Module(
        includes = [
            ApiModule::class
        ]
)
class DataModule
