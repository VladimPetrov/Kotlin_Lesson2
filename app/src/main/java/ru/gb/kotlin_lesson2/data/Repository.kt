package ru.gb.kotlin_lesson2.data

class Repository : IRepository {

    override fun getMovieFromServer(): Movie {
        return Movie()
    }

    override fun getMovieFromLocalStorage(): Movie {
        return Movie()
    }
}