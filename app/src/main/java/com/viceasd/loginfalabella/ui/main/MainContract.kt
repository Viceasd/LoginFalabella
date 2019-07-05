package com.viceasd.loginfalabella.ui.main

import com.viceasd.loginfalabella.ui.base.BaseContract

class MainContract {
    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}