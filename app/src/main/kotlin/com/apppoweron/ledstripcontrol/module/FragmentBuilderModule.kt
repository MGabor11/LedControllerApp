package com.apppoweron.ledstripcontrol.module

import com.apppoweron.ledstripcontrol.WalkthroughFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector()
    internal abstract fun bindWalkthroughFragment(): WalkthroughFragment
}