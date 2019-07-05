package com.viceasd.loginfalabella.module

import android.app.Activity
import com.viceasd.loginfalabella.ui.main.MainContract
import com.viceasd.loginfalabella.ui.main.MainPresenter
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}