package com.shid.topkotlinrepos.githubapi.model

import javax.inject.Inject
import javax.inject.Singleton

interface GithubApi {

    fun getTopRepositories(): List<RepoApiModel>
}

@Singleton
class MockGithubApi @Inject constructor():GithubApi{
    override fun getTopRepositories(): List<RepoApiModel> {
        return listOf(
            RepoApiModel(
                id= 1L,
                name = "Mock Repo",
                description = "Mock Repo Description",
                owner = UserApiModel(id = 1L,login = "dagger"),
                stargazersCount = 1,
                forksCount = 1,
                contributorsUrl = "",
                createDate = "01/01/2020",
                updateDated = "01/01/2020"

            )
        )
    }

}