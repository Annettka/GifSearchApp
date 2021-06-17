package by.it.academy.gifsearchapp.framework.api

import by.it.academy.gifsearchapp.app.data.models.giphyresponse.Giphy
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyApi {


//    @Headers("Accept-Version: v1", "Authorisation: api_key $API_KEY")
    @GET("trending")
    suspend fun getTrendingGifs (
        @Query ("api_key") apiKey : String,
//        @Query ("limit") limit : Int,
//        @Query ("rating") rating : String
    ): Response<Giphy>

    @GET("search")
    suspend fun searchGifs(
        @Query ("api_key") apiKey : String,
        @Query ("q") query : String,
//        @Query ("limit") limit : Int
    ) : Response<Giphy>
}