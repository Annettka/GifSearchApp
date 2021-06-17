package by.it.academy.gifsearchapp

import android.app.Application
import by.it.academy.gifsearchapp.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class GifApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@GifApplication)
            modules(apiModule, networkModule,repositoryModule, interactorModule, viewModelModule)
        }
    }
}