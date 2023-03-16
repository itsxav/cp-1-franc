package itsxav.kotlin.com.cp2

fun main() {
//    val t : Int = readLine()!!.toInt()// jumlah kasus uji
//    repeat(t) { i ->
//        val a : Int = readLine()!!.toInt() // membaca bilangan pertama
//        val b : Int = readLine()!!.toInt() // membaca bilangan kedua
//        var sum = 0
//        for (i in a..b) {
//            if (i % 2 != 0) { // memeriksa apakah bilangan ganjil
//                sum += i // menambahkan bilangan ganjil ke jumlah
//            }
//        }
//        println("Case ${i+1} : $sum") // mencetak hasil kasus uji
//    }
//    return

    print("Masukkan jumlah kasus uji: ")
    val cobanomor = readLine()?.toInt() ?: 0

    for (coba in 1..cobanomor) {
        println("Masukkan bilangan a untuk kasus uji #$coba:")
        val a = readLine()?.toInt() ?: 0

        println("Masukkan bilangan b untuk kasus uji #$coba:")
        val b = readLine()?.toInt() ?: 0

        var sum = 0
        for (i in a..b) {
            if (i % 2 == 1) {
                sum += i
            }
        }
        println("Case $coba : $sum\n")
    }

}
//fun test(){
//    println("masukan angka: ")
//    var case = 0
//    val a = readLine()?.toInt() ?: 0
//    val b = readLine()?.toInt() ?: 0
//    val ganjil = mutableListOf<Int>()
//
//    for (i in a..b) {
//        if (i%2 == 1 ){
//            ganjil.add(i)
//        }
//    }
//    println("nilai ganjil dalam range $a..$b adalah $ganjil")
//    val hasil = ganjil.sum()
//    case++
//
//    println("case $case: $hasil")
//}
//
//fun main(){
//
//
//    println(test())
//    println(test())
//
//}