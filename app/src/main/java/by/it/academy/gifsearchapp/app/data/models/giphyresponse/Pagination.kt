package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Pagination (
    @SerializedName("total_count")
    @Expose
    var totalCount: Int,

    @SerializedName("count")
    @Expose
    var count: Int,

    @SerializedName("offset")
    @Expose
    var offset: Int
): Serializable