package org.example.models

data class Question(
    val description: String = "",
    var answer: Int = 0,
    var answerFunction: (() -> Int)? = null
)

fun List<Question>.setAnswers(answerList: List<Int>): List<Question> {
    val newList = mutableListOf<Question>()

    this.forEachIndexed { index, question ->
        newList.add(Question(question.description, answerList[index]))
    }

    return newList
}
