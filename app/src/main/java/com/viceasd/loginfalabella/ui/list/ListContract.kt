package com.viceasd.loginfalabella.ui.list

import com.viceasd.loginfalabella.models.DetailsViewModel
import com.viceasd.loginfalabella.models.Post
import com.viceasd.loginfalabella.ui.base.BaseContract

class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}