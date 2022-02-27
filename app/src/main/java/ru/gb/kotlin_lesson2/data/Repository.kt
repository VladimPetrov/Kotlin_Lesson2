package ru.gb.kotlin_lesson2.data

class Repository : IRepository {

    override fun getMovieFromServer(): Movie {
        return Movie()
    }

    override fun getMovieFromLocalStorage(): List<Movie> = getMovieList()
    override fun getMultFromLocalStorage(): List<Movie> = getMultList()
}