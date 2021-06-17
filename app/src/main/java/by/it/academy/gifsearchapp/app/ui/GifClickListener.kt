package by.it.academy.gifsearchapp.app.ui

import by.it.academy.gifsearchapp.app.domain.models.Gif

interface GifClickListener {
    fun onGifClick(gif: Gif)
}