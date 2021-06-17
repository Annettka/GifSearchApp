package by.it.academy.gifsearchapp.app.data.mappers

import by.it.academy.gifsearchapp.app.domain.models.Gif
import by.it.academy.gifsearchapp.app.data.models.giphyresponse.Datum

fun Datum.toGif() = Gif(
    url = images.previewGif.url
)
