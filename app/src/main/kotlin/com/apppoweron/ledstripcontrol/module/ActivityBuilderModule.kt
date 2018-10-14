package com.apppoweron.ledstripcontrol.module

import com.apppoweron.ledstripcontrol.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    internal abstract fun bindMainActivity(): MainActivity
}
