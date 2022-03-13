fun main(args: Array<String>) {
//        String adalah array dari karakter yang mempunyai sifat immutable (bersifat statis).

//    kita bisa menambahkan operator + maka tipe data yang ingin di gabungkan akan otomatis tergabung ke dalam string.
    fun main(args: Array<String>) {
        val s = "abc" + 1
        println(s + "def")
    }

    /*
    raw string yang di pisahkan dengan triple quotes (""") digunakan untuk menyimpan data string yang memuat
    keywords. kita juga dapat menghapus spasi yang tidak di perlukan dalam raw string.
     */
    var text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Nelia Dane)
        """.trimMargin()
    println(text)
}