package com.example.android.navigationsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class SampleViewModel(private val state: SavedStateHandle) : ViewModel() {

  companion object {
    private const val KEY = "key"
  }

  private val _data = state.getLiveData(KEY, "")
  val data: LiveData<String> = _data

  fun setData(data: String) {
    state.set(KEY, data)
  }

}