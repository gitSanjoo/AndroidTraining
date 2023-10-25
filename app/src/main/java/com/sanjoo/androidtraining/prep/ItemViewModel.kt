package com.sanjoo.androidtraining.prep

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {
     var selectedItem=MutableLiveData<String>()

    fun setData(item : String){
        selectedItem.value = item
    }

    fun getSelectedItem():LiveData<String>{
        return selectedItem
    }
}