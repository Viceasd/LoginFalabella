package com.viceasd.loginfalabella.component

import com.viceasd.loginfalabella.BaseApp
import com.viceasd.loginfalabella.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf( ApplicationModule::class))
interface ApplicationComponent {
    fun inject(application: BaseApp)
}