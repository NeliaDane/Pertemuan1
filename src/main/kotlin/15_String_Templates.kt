fun main() {

    /*
    string di awali dengan tanda dolar ($) yang di ikuti dengan nama variabel
    yang akan di gabungkan kedalam string. kurung kurawal di gunakan untuk melakukan
    pemrosesan pada saat menggabungkan variabel dalam template string karna karakter
    dolar $ tidak bisa di cetak menggunakan escape character sehingga di gunakanlah
    template string untuk mencetaknya.
     */
    val a = 7
    val b = 8
    val c = a + b
    val s = " jika kita menambahkan $a dan $b maka hasilnya $c "
    println(s)
    println(" jika kita menambahkan $a dan $b, maka hasilnya ${a+b}")
    val price = """
        ${'$'}9.99
    """.trimIndent()
    println(price)
}