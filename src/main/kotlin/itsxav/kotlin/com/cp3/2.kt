package itsxav.kotlin.com.cp3

fun main() {
    while (true) {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        if (n == 0 && m == 0) break

        val numbers = mutableListOf<Int>()
        repeat(n) {
            val x = readLine()!!.toInt()
            numbers.add(x)
        }
        numbers.sortWith(compareBy({ it % m }, { it % 2 == 1 && it % m == 0 },
            { if (it % 2 == 1) -it else it }))

        val x = readLine()
        println("$n $m")
        numbers.forEach { println(it) }
        println("0 0")
    }
}

fun compare(x: Int, y: Int, m: Int): Boolean {
    val mx = (x % m + m) % m
    val my = (y % m + m) % m

    if (mx < my) return true
    if (mx > my) return false

    if (x % 2 == 1 && y % 2 == 0) return true
    if (x % 2 == 0 && y % 2 == 1) return false

    if (x % 2 == 1 && y % 2 == 1) {
        if (x > y) return true
        else return false
    }

    if (x % 2 == 0 && y % 2 == 0) {
        if (x < y) return true
        else return false
    }

    return false
}