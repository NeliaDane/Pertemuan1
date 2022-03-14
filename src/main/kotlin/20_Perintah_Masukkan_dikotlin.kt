fun main(args: Array<String>) {
    /*
    Perintah masukkan di Kotlin yaitu sebuah fungsi readLine()!!. Secara default perintah masukkan
di Kotlin akan mengembalikan nilai String ke dalam variabel penampung. Untuk merubah nilai String
yang dikembalikan oleh fungsi readLine()!! kedalam nilai yang diinginkan bisa dilakukan dengan
menggunakan konversi secara eksplisit
     */

//Doubler program parsing
//    untuk membuat nilai yang di input di kalikan 2
    println("Enter a number and I'll double it: ")
    val input = readLine()!!
    var a = input.toInt()
    a = a * 2
    println(a)

//    untuk membuat nilai yang di inputkan menjadi di kuadratkan
    println("Enter a number, and I'll square it:")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)
}