package by.it.academy.gifsearchapp.app.data.repositories


import by.it.academy.gifsearchapp.framework.api.GiphyApi
import by.it.academy.gifsearchapp.app.domain.API_KEY
import by.it.academy.gifsearchapp.app.domain.repositories.GifRepository
import by.it.academy.gifsearchapp.app.domain.models.Gif
import by.it.academy.gifsearchapp.app.data.mappers.toGif

class GifRepositoryImpl(private val api: GiphyApi) : GifRepository {

    override suspend fun getTrendingGifs(): List<Gif> {
        try {
            val response = api.getTrendingGifs(API_KEY)
            return if (response.isSuccessful) {
                response.body()!!.data.map {
                    it.toGif()
                }
            } else emptyList()
        }catch (e: Exception) {
            e.printStackTrace()
        }
        return emptyList()
    }

    override suspend fun searchGifs(query: String): List<Gif> {
        try {
            val response = api.searchGifs(API_KEY, query)
            return if (response.isSuccessful) {
                response.body()!!.data.map {
                    it.toGif()
                }
            } else emptyList()
        }catch (e: Exception) {
            e.printStackTrace()
        }
        return emptyList()
    }
}