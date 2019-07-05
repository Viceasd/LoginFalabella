package com.viceasd.loginfalabella.module

import com.viceasd.loginfalabella.api.ApiServiceInterface
import com.viceasd.loginfalabella.ui.about.AboutContract
import com.viceasd.loginfalabella.ui.about.AboutPresenter
import com.viceasd.loginfalabella.ui.list.ListContract
import com.viceasd.loginfalabella.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}