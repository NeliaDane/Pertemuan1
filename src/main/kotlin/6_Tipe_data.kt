fun main(args: Array<String>) {
//    type data
    /*
    tipe data pada kotlin :
    1. byte = mempunyai size 8 bits, min value -128, dan max value 127
    2. short = mempunyai size 16 bits, min value -32768, dan max value 32767
    3. int =  mempunyai size 32 bits, min value -2,147,483,648 (-2^31), dan max value 2,147,483,647 (2^31- 1)
    4. long = mempunyai size 64 bits, min value -9,223,372,036,854,775,808 (-2^63), dan max value 9,223,372,036,854,775,807(2^63-1)
     */
    val minByte: Byte = -128
    val maxByte: Byte = 127
    val minShort: Short = -32768
    val maxShort: Short = 32767
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807

//mencetak sesuai dengan tipe data
    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)
}