package com.example.codingchallenge1

import androidx.lifecycle.ViewModel

class ViewModelDemo :ViewModel(){
    var count =0
    fun countUpdate(){
        count++
    }
}