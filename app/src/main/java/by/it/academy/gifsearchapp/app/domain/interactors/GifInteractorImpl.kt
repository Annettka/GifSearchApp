package by.it.academy.gifsearchapp.app.domain.interactors

import by.it.academy.gifsearchapp.app.domain.repositories.GifRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class GifInteractorImpl(private val repository: GifRepository) : GifInteractor {

    private lateinit var out: GifOut

    override fun setInteractorOut(out: GifOut) {
        this.out = out
    }

    override fun loadTrending() {
        GlobalScope.launch {
            val gifs = withContext(Dispatchers.Main) {
                repository.getTrendingGifs()
            }
            withContext(Dispatchers.Main) {
                out.gifsLoaded(gifs)
            }
        }
    }

    override fun search(query: String) {
        GlobalScope.launch {
            val gifs = withContext(Dispatchers.IO) {
                repository.searchGifs(query)
            }
            withContext(Dispatchers.Main) {
                out.gifsLoaded(gifs)
            }
        }
    }
}