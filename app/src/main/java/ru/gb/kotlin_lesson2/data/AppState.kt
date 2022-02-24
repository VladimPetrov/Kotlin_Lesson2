package ru.gb.kotlin_lesson2.data

sealed class AppState {
    data class Success(val movie: Movie) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
