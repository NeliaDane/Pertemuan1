fun main() {
//    konversi implisit
    val valInt : Int = 1
    val valSum : Long = 3L + valInt
    println("Konversi variabel valInt secara implisit :" + valSum)

//    konversi eksplisit
    val valLong : Long = valInt.toLong()
    println("Konversi variabel valInt secara eksplisit :" + valLong)
}