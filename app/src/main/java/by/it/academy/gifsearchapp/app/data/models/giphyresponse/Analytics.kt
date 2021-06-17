package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Analytics (
    @SerializedName("onload")
    @Expose
    val onload: Onload,

    @SerializedName("onclick")
    @Expose
    private val onclick: Onclick,

    @SerializedName("onsent")
    @Expose
    private val onsent: Onsent
): Serializable