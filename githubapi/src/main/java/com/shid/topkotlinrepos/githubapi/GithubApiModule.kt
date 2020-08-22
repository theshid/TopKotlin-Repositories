package com.shid.topkotlinrepos.githubapi

import com.shid.topkotlinrepos.githubapi.model.GithubApi
import com.shid.topkotlinrepos.githubapi.model.MockGithubApi
import dagger.Binds
import dagger.Module

@Module
interface GithubApiModule {

    @Binds
    fun BindGithubApi(mockGithubApi: MockGithubApi):GithubApi
}