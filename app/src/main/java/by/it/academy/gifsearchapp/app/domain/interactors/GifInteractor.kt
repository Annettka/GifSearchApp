package by.it.academy.gifsearchapp.app.domain.interactors

interface GifInteractor {
    fun setInteractorOut(out: GifOut)
    fun loadTrending()
    fun search(query: String)
}