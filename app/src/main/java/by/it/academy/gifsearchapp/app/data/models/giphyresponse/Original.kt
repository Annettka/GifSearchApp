package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Original (
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
    var url: String,

    @SerializedName("mp4_size")
    @Expose
    var mp4Size: String,

    @SerializedName("mp4")
    @Expose
    var mp4: String,

    @SerializedName("webp_size")
    @Expose
    var webpSize: String,

    @SerializedName("webp")
    @Expose
    var webp: String,

    @SerializedName("frames")
    @Expose
    var frames: String,

    @SerializedName("hash")
    @Expose
    var hash: String
): Serializable