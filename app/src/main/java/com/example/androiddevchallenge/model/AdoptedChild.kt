package com.example.androiddevchallenge.model

data class AdoptedChild(
    val fosterParent: FosterParent,
    val name: String,
    val image: Int,
    val old: String,
    val description: String,
    val descriptionDetail: String
)