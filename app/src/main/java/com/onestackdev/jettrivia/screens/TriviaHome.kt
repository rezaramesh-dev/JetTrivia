package com.onestackdev.jettrivia.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.onestackdev.jettrivia.components.Questions

@Composable
fun TriviaHome(viewModel: QuestionViewModel = hiltViewModel()) {
    Questions(viewModel)
}