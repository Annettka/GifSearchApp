package by.it.academy.gifsearchapp.app.domain.interactors

import by.it.academy.gifsearchapp.app.domain.models.Gif

interface GifOut {
    fun gifsLoaded(gifs: List<Gif>)
}