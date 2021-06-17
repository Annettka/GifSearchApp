package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User (
    @SerializedName("avatar_url")
    @Expose
    var avatarUrl: String,

    @SerializedName("banner_image")
    @Expose
    var bannerImage: String,

    @SerializedName("banner_url")
    @Expose
    var bannerUrl: String,

    @SerializedName("profile_url")
    @Expose
    var profileUrl: String,

    @SerializedName("username")
    @Expose
    var username: String,

    @SerializedName("display_name")
    @Expose
    var displayName: String,

    @SerializedName("description")
    @Expose
    var description: String,

    @SerializedName("instagram_url")
    @Expose
    var instagramUrl: String,

    @SerializedName("website_url")
    @Expose
    var websiteUrl: String,

    @SerializedName("is_verified")
    @Expose
    var isVerified: Boolean
): Serializable