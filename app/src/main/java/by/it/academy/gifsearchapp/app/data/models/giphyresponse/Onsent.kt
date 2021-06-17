package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Onsent (
    @SerializedName("url")
    @Expose
    var url: String
): Serializable