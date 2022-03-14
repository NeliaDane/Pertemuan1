fun main(args: Array<String>) {
//Simple calculator
    /*
    Program ini menerima 2 masukkan bilangan dan akan melakukan operasi tambah, kurang, kali
    dan bagi dari kedua bilangan yang dimasukkan.
     */

    println("Welcome to calculator")

//    untuk mengisi masukan bilangan pertama
    println("Enter the first number:")
    val a = readLine()!!.toDouble()

//    untuk mengisi masukan bilangan kedua
    println("Enter the second number:")
    val b = readLine()!!.toDouble()

//    proses penjumlahan
    val sum = a + b
//    proses pengurangan
    val difference = a - b
//    proses perkalian
    val product = a * b
//    proses pembagian
    val quotient = a / b

//    pemanggilan untuk mencetak hasil dari proses
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Quotient: ${quotient}")
    println("Thank you for using calculator.")
}