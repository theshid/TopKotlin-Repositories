package com.shid.topkotlinrepos.githubapi.model

class RepoApiModel (
    val id:Long,
val name:String,
    val description:String,
    val owner:UserApiModel,
    val stargazersCount:Int,
    val forksCount:Int,
    val contributorsUrl:String,
    val createDate:String,
    val updateDated:String
){
}