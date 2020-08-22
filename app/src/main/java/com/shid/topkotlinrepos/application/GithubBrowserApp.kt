package com.shid.topkotlinrepos.application

import android.app.Application

class GithubBrowserApp:Application() {

    private val appComponent by lazy{
        DaggerApplicationComponent.factory().create(this)
    }
}