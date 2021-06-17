package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Hd (
    @SerializedName("height")
    @Expose
    var height: String,

    @SerializedName("width")
    @Expose
    var width: String,

    @SerializedName("mp4_size")
    @Expose
    var mp4Size: String,

    @SerializedName("mp4")
    @Expose
    var mp4: String
) : Serializable