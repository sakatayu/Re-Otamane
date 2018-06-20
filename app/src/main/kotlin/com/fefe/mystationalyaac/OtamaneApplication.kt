package com.fefe.mystationalyaac

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import com.fefe.mystationalyaac.di.DaggerOtamaneApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class OtamaneApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingAndroidFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()

        DaggerOtamaneApplicationComponent.builder()
                .application(this)
                .bind()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingAndroidFragmentInjector
}
