package by.it.academy.gifsearchapp.app.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import by.it.academy.gifsearchapp.app.domain.interactors.GifInteractor
import by.it.academy.gifsearchapp.app.domain.interactors.GifOut
import by.it.academy.gifsearchapp.app.domain.models.Gif

class GifViewModel(private val interactor: GifInteractor) : ViewModel(), GifOut {

    private var _gifList = MutableLiveData<List<Gif>>()
    val gifList: LiveData<List<Gif>> = _gifList

    private var _selectedGif = MutableLiveData<Gif>()
    val selectedGif: LiveData<Gif> = _selectedGif

    init {
        interactor.setInteractorOut(this)
        getTrendingGifs()
    }

    private fun getTrendingGifs() {
        interactor.loadTrending()
    }

    fun searchGifs(query: String) {
        interactor.search(query)
    }

    fun setSelectedGif(gif: Gif) {
        _selectedGif.value = gif
    }

    override fun gifsLoaded(gifs: List<Gif>) {
        _gifList.value = gifs
    }

}