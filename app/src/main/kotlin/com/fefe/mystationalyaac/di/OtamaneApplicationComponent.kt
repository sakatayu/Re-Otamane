package com.fefe.mystationalyaac.di

import android.app.Application
import com.fefe.mystationalyaac.OtamaneApplication
import com.fefe.mystationalyaac.data.DataModule
import com.fefe.mystationalyaac.ui.ViewModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            OtamaneApplicationModule::class,
            DataModule::class,
            ViewModule::class
        ]
)
interface OtamaneApplicationComponent : AndroidInjector<OtamaneApplication>{

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application) : Builder

        fun bind() : OtamaneApplicationComponent
    }

    override fun inject(instance: OtamaneApplication?)
}
