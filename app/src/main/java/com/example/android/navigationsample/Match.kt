/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.navigation.Navigation
import androidx.navigation.navGraphViewModels

/**
 * Shows a warning-up screen.
 */
class Match : Fragment() {

  private val viewModel: SampleViewModel by navGraphViewModels(R.id.navigation) {
    SavedStateViewModelFactory(this)
  }

  override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    val view = inflater.inflate(R.layout.fragment_match, container, false)

    view.findViewById<TextView>(R.id.textView).text = viewModel.data.value

    view.findViewById<View>(R.id.play_btn3).setOnClickListener {
      Navigation.findNavController(view).navigate(R.id.action_match_to_in_game)
    }
    return view
  }

}
