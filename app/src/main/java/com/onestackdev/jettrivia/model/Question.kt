package com.onestackdev.jettrivia.model

class Question : ArrayList<QuestionItem>()

data class QuestionItem(
    val answer: String,
    val category: String,
    val choices: List<String>,
    val question: String
)