package com.example.myapplication.favorites

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.FirebaseRepository
import com.example.myapplication.models.Item
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class FavoritesViewModel(private val repository: FirebaseRepository = FirebaseRepository()) : ViewModel() {

    val favoriteItems: StateFlow<List<Item>> = repository.getFavoriteItems()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )
}
