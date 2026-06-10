package com.example.myapplication.models

data class Item(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val favorite: Boolean = false
) {
    // Empty constructor for Firebase
    constructor() : this("", "", "", false)
}
