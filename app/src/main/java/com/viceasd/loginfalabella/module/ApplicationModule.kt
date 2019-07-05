package com.viceasd.loginfalabella.module


import android.app.Application
import com.viceasd.loginfalabella.BaseApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import com.viceasd.loginfalabella.scope.PerApplication


@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}