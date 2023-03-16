package itsxav.kotlin.com.cp1

data class Answer(val number: Int, val answer: Char)

data class ArrayNum (val index: Int, val value: Char)

fun main() {
    val numchar = arrayOf(
        ArrayNum(2, 'd'),
        ArrayNum(3, 'c'),
        ArrayNum(1, 'b'),
        ArrayNum(5, 'e'),
        ArrayNum(4, 'a')
    )

    val sortedNumchar = numchar.sortedBy { it.index }

    for (ArrayNum in sortedNumchar) {
        println("${ArrayNum.index}. ${ArrayNum.value}")
    }
}