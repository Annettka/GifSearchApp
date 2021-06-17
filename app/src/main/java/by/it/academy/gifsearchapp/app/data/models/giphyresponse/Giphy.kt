package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Giphy (
    @SerializedName("data")
    @Expose
    var data: List<Datum>,

    @SerializedName("pagination")
    @Expose
    var pagination: Pagination,

    @SerializedName("meta")
    @Expose
    var meta: Meta
): Serializable