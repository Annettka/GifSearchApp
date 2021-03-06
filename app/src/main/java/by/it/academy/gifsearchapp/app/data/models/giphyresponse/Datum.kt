package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Datum (
    @SerializedName("type")
    @Expose
    var type: String,

    @SerializedName("id")
    @Expose
    var id: String,

    @SerializedName("url")
    @Expose
    var url: String,

    @SerializedName("slug")
    @Expose
    var slug: String,

    @SerializedName("bitly_gif_url")
    @Expose
    var bitlyGifUrl: String,

    @SerializedName("bitly_url")
    @Expose
    var bitlyUrl: String,

    @SerializedName("embed_url")
    @Expose
    var embedUrl: String,

    @SerializedName("username")
    @Expose
    var username: String,

    @SerializedName("source")
    @Expose
    var source: String,

    @SerializedName("title")
    @Expose
    var title: String,

    @SerializedName("rating")
    @Expose
    var rating: String,

    @SerializedName("content_url")
    @Expose
    var contentUrl: String,

    @SerializedName("source_tld")
    @Expose
    var sourceTld: String,

    @SerializedName("source_post_url")
    @Expose
    var sourcePostUrl: String,

    @SerializedName("is_sticker")
    @Expose
    var isSticker: Int,

    @SerializedName("import_datetime")
    @Expose
    var importDatetime: String,

    @SerializedName("trending_datetime")
    @Expose
    var trendingDatetime: String,

    @SerializedName("images")
    @Expose
    var images: Images,

    @SerializedName("user")
    @Expose
    var user: User,

    @SerializedName("analytics_response_payload")
    @Expose
    var analyticsResponsePayload: String,

    @SerializedName("analytics")
    @Expose
    var analytics: Analytics
    ) : Serializable