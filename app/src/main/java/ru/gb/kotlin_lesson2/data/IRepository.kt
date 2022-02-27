package ru.gb.kotlin_lesson2.data

interface IRepository {
    fun getMovieFromServer(): Movie
    fun getMovieFromLocalStorage(): List<Movie>
    fun getMultFromLocalStorage(): List<Movie>
}