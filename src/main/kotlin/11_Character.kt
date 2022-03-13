fun main(args: Array<String>) {

    /*
    tanda character pada kotlin adalah pemberian single quotes pada nilai sebuah variabel.
    Caracter di kotlin adalah sebagai objek yang memiliki fungsi anggota contohnya : isLowerCase(),
isDigit(),toUpperCase(), toLowerCase(), toString() dan lainnya.
     */
    var charA : Char = 'A'
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini char A sudah menjadi string = " +strA)
}