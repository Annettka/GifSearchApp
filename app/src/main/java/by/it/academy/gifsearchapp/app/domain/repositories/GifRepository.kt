package by.it.academy.gifsearchapp.app.domain.repositories

import by.it.academy.gifsearchapp.app.domain.models.Gif

interface GifRepository {
suspend fun getTrendingGifs(): List<Gif>
suspend fun searchGifs(query: String): List<Gif>
}