package com.shid.topkotlinrepos.application

import android.content.Context
import com.shid.topkotlinrepos.githubapi.GithubApiModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [GithubApiModule::class])
@Singleton
interface ApplicationComponent {

    @Component.Factory
    interface factory{
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}