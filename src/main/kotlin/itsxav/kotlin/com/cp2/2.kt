package itsxav.kotlin.com.cp2

fun multiple(number: Int){

    if (number % 11 != 0) {
        println("$number is a multiple of 11")
    } else if (number == 0)
    {

    } else {
        println("$number is not a multiple of 11")
    }
}

fun main() {
    println(multiple(112233))
    println(multiple(30800))
    println(multiple(2937))
    println(multiple(323455693))
    println(multiple(5038297))
    println(multiple(112234))

}

//fun main() {
//    while (true) {
//        val input = readLine()!!.trim() // read input and trim whitespace
//        if (input == "0") break // exit loop if input is 0
//        var sum = 0
//        for (i in input.indices) {
//            val digit = input[i].toInt() - 48 // convert char to int
//            sum += if (i % 2 == 0) digit else -digit // alternate summing and subtracting
//        }
//        if (sum % 11 == 0) println("$input is a multiple of 11.") // check if sum is a multiple of 11
//        else println("$input is not a multiple of 11.")
//    }
//}