package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Looping (
    @SerializedName("mp4_size")
    @Expose
    var mp4Size: String,

    @SerializedName("mp4")
    @Expose
    var mp4: String
): Serializable