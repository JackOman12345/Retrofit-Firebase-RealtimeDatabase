package com.example.myapplication.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.FirebaseRepository
import com.example.myapplication.models.Item
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ProfileViewModel(private val repository: FirebaseRepository = FirebaseRepository()) : ViewModel() {

    private val _uploadStatus = MutableStateFlow<Result<Unit>?>(null)
    val uploadStatus: StateFlow<Result<Unit>?> = _uploadStatus

    fun addItem(name: String, description: String, isFavorite: Boolean) {
        viewModelScope.launch {
            val item = Item(name = name, description = description, favorite = isFavorite)
            _uploadStatus.value = repository.uploadItem(item)
        }
    }

    fun resetStatus() {
        _uploadStatus.value = null
    }
}
