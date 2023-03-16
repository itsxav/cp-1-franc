package itsxav.kotlin.com.cp2

//fun main() {
//    val x2 = "this is me \" Xav \" Ghost"
//    val x = x2.replace("\"","''")
//
//    println(x)
//}
import java.util.Scanner

fun main() {
    println("Masukkan Kalimat : ")
    val scanner = Scanner(System.`in`)
    var openQuote = true // flag to track whether we are inside an open quote or not

    while (scanner.hasNextLine()) {
        val line = scanner.nextLine()
        var result = ""
        for (c in line) {
            if (c == '"') {
                result += if (openQuote) "``" else "''"
                openQuote = !openQuote // toggle the flag
            } else {
                result += c
            }
        }
        println(result)
    }
}