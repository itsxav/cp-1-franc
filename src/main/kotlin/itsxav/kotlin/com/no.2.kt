package itsxav.kotlin.com

import java.io.File

data class Answer(val number: Int, val answer: Char)

fun main() {
    val inputFile = File("testdata.in")
    val t = inputFile.readLine().toInt()
    repeat(t) {
        val n = inputFile.readLine().toInt()
        val answers = Array(n) {
            val (number, answer) = inputFile.readLine().split(". ")
            Answer(number.toInt(), answer.first())
        }
        answers.sortBy { it.number }
        println("Test Case #${it + 1}:")
        answers.forEach { println("${it.number}. ${it.answer}") }
    }
}