package com.example.newsapp.di

import android.app.Application
import com.example.newsapp.data.manager.LocalUserMangerImpl
import com.example.newsapp.domain.manager.LocalUserManger
import com.example.newsapp.domain.usecases.AppEntryUseCases
import com.example.newsapp.domain.usecases.ReadAppEntry
import com.example.newsapp.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManger = LocalUserMangerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManger
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

}