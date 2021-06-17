package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Meta (
    @SerializedName("status")
    @Expose
    var status: Int,

    @SerializedName("msg")
    @Expose
    var msg: String,

    @SerializedName("response_id")
    @Expose
    var responseId: String
):Serializable