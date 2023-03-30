package itsxav.kotlin.com.cp3

//fun main() {
//    var input = readLine()!!.split(" ")
//    var n = input[0].toInt()
//    var m = input[1].toInt()
//
//    while (n != 0 && m != 0) {
//        val arr = IntArray(n)
//        for (i in 0 until n) {
//            arr[i] = readLine()!!.toInt()
//        }
//
//        // Algoritma Insertion Sort
//        for (i in 1 until n) {
//            val key = arr[i]
//            var j = i - 1
//
//            while (j >= 0 && compareValues(modulo(key, m), modulo(arr[j], m)) < 0) {
//                arr[j + 1] = arr[j]
//                j--
//            }
//
//            if (j >= 0 && modulo(key, m) == modulo(arr[j], m)) {
//                if (key % 2 == 1 && arr[j] % 2 == 0) {
//                    arr[j + 1] = arr[j]
//                    j--
//                } else if (key % 2 == 0 && arr[j] % 2 == 1) {
//                    // Do nothing
//                } else if (key % 2 == 1 && arr[j] % 2 == 1) {
//                    if (key < arr[j]) {
//                        arr[j + 1] = arr[j]
//                        j--
//                    } else {
//                        // Do nothing
//                    }
//                } else if (key % 2 == 0 && arr[j] % 2 == 0) {
//                    if (key > arr[j]) {
//                        arr[j + 1] = arr[j]
//                        j--
//                    } else {
//                        // Do nothing
//                    }
//                }
//            }
//
//            arr[j + 1] = key
//        }
//
//        // Cetak output
//        println("$n $m")
//        for (i in 0 until n) {
//            println(arr[i])
//        }
//
//        // Baca input berikutnya
//        input = readLine()!!.split(" ")
//        n = input[0].toInt()
//        m = input[1].toInt()
//    }
//}
//
//fun modulo(a: Int, b: Int): Int {
//    var result = a % b
//    if (result < 0) {
//        result += b
//    }
//    return result
//}

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true) {
        val n = input.nextInt()
        val m = input.nextInt()

        if (n == 0 && m == 0) {
            break
        }

        val numbers = mutableListOf<Int>()

        for (i in 0 until n) {
            numbers.add(input.nextInt())
        }

        Collections.sort(numbers, Comparator<Int> { a, b ->
            when {
                a % m < b % m -> -1
                a % m > b % m -> 1
                a % 2 == 0 && b % 2 != 0 -> 1
                a % 2 != 0 && b % 2 == 0 -> -1
                a % 2 == 0 && b % 2 == 0 -> {
                    if (a < b) -1 else 1
                }
                else -> {
                    if (a < b) 1 else -1
                }
            }
        })

        println("$n $m")

        for (number in numbers) {
            println(number)
        }
    }
}