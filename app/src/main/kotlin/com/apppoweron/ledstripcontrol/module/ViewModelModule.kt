package com.apppoweron.ledstripcontrol.module

import androidx.lifecycle.ViewModel
import com.apppoweron.ledstripcontrol.annotation.ViewModelKey
import com.apppoweron.ledstripcontrol.viewmodel.WalkthroughViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(WalkthroughViewModel::class)
    abstract fun bindWalkthroughViewModel(walkthroughViewModel: WalkthroughViewModel): ViewModel
}
