package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class FixedWidthSmallStill (
    @SerializedName("height")
    @Expose
    var height: String,

    @SerializedName("width")
    @Expose
    var width: String,

    @SerializedName("size")
    @Expose
    var size: String,

    @SerializedName("url")
    @Expose
    var url: String
): Serializable