package com.onestackdev.jettrivia.repository

import android.util.Log
import com.onestackdev.jettrivia.data.DataOrException
import com.onestackdev.jettrivia.model.QuestionItem
import com.onestackdev.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val dataOrException = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestion(): DataOrException<ArrayList<QuestionItem>, Boolean, java.lang.Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false
        } catch (exception: Exception) {
            dataOrException.e = exception
            Log.d("Exc", "getAllQuestion: ${dataOrException.e!!.localizedMessage}")
        }
        return dataOrException
    }
}