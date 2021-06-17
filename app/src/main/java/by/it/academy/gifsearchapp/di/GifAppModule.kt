package by.it.academy.gifsearchapp.di

import by.it.academy.gifsearchapp.app.domain.repositories.GifRepository
import by.it.academy.gifsearchapp.app.data.repositories.GifRepositoryImpl
import by.it.academy.gifsearchapp.app.domain.BASE_URL
import by.it.academy.gifsearchapp.app.domain.interactors.GifInteractor
import by.it.academy.gifsearchapp.app.domain.interactors.GifInteractorImpl
import by.it.academy.gifsearchapp.app.ui.viewmodels.GifViewModel
import by.it.academy.gifsearchapp.framework.api.GiphyApi
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {

    fun provideGiphyApi(retrofit: Retrofit): GiphyApi {
        return retrofit.create(GiphyApi::class.java)
    }

    single { provideGiphyApi(get()) }
}

val networkModule = module {

     fun provideRetrofit(baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single { provideRetrofit(BASE_URL) }
}

val repositoryModule = module {
    single<GifRepository> { GifRepositoryImpl(get()) }
}

val viewModelModule = module {
    viewModel { GifViewModel(get()) }
}

val interactorModule = module {
    single <GifInteractor> { GifInteractorImpl(get()) }
}
