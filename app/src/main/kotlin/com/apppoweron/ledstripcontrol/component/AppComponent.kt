package com.apppoweron.ledstripcontrol.component

import com.apppoweron.ledstripcontrol.LedStripControlApplication
import com.apppoweron.ledstripcontrol.module.ActivityBuilderModule
import com.apppoweron.ledstripcontrol.module.ViewModelFactoryModule
import com.apppoweron.ledstripcontrol.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelFactoryModule::class,
    ViewModelModule::class,
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class])
interface AppComponent : AndroidInjector<LedStripControlApplication> {

    override fun inject(application: LedStripControlApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: LedStripControlApplication): Builder

        fun build(): AppComponent
    }
}
