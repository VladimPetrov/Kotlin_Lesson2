package ru.gb.kotlin_lesson2.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.kotlin_lesson2.data.AppState
import ru.gb.kotlin_lesson2.data.IRepository
import ru.gb.kotlin_lesson2.data.Repository
import java.lang.Thread.sleep

class MainViewModel(private  val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
            private val repository : IRepository = Repository()) : ViewModel() {

    fun getLiveData() = liveDataToObserve

    fun getMovieFromLocalSource() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveDataToObserve.postValue(AppState.Loading)
        Thread {
            sleep(2000)
            liveDataToObserve.postValue(AppState.Success(repository.getMovieFromLocalStorage()))
        }.start()
    }
}