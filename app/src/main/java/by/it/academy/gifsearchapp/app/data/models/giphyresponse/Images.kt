package by.it.academy.gifsearchapp.app.data.models.giphyresponse

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

data class Images (
    @SerializedName("original")
    @Expose
    var original: Original,

    @SerializedName("downsized")
    @Expose
    var downsized: Downsized,

    @SerializedName("downsized_large")
    @Expose
    var downsizedLarge: DownsizedLarge,

    @SerializedName("downsized_medium")
    @Expose
    var downsizedMedium: DownsizedMedium,

    @SerializedName("downsized_small")
    @Expose
    var downsizedSmall: DownsizedSmall,

    @SerializedName("downsized_still")
    @Expose
    var downsizedStill: DownsizedStill,

    @SerializedName("fixed_height")
    @Expose
    var fixedHeight: FixedHeight,

    @SerializedName("fixed_height_downsampled")
    @Expose
    var fixedHeightDownsampled: FixedHeightDownsampled,

    @SerializedName("fixed_height_small")
    @Expose
    var fixedHeightSmall: FixedHeightSmall,

    @SerializedName("fixed_height_small_still")
    @Expose
    var fixedHeightSmallStill: FixedHeightSmallStill,

    @SerializedName("fixed_height_still")
    @Expose
    var fixedHeightStill: FixedHeightStill,

    @SerializedName("fixed_width")
    @Expose
    var fixedWidth: FixedWidth,

    @SerializedName("fixed_width_downsampled")
    @Expose
    var fixedWidthDownsampled: FixedWidthDownsampled,

    @SerializedName("fixed_width_small")
    @Expose
    var fixedWidthSmall: FixedWidthSmall,

    @SerializedName("fixed_width_small_still")
    @Expose
    var fixedWidthSmallStill: FixedWidthSmallStill,

    @SerializedName("fixed_width_still")
    @Expose
    var fixedWidthStill: FixedWidthStill,

    @SerializedName("looping")
    @Expose
    var looping: Looping,

    @SerializedName("original_still")
    @Expose
    var originalStill: OriginalStill,

    @SerializedName("original_mp4")
    @Expose
    var originalMp4: OriginalMp4,

    @SerializedName("preview")
    @Expose
    var preview: Preview,

    @SerializedName("preview_gif")
    @Expose
    var previewGif: PreviewGif,

    @SerializedName("preview_webp")
    @Expose
    var previewWebp: PreviewWebp,

    @SerializedName("480w_still")
    @Expose
    private var _480wStill: _480wStill,

    @SerializedName("hd")
    @Expose
    var hd: Hd
): Serializable