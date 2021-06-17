package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Onclick (
    @SerializedName("url")
    @Expose
    var url: String
)