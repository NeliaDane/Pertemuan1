fun main() {
//ASCII value
    // karakter
    var c: Char
    // nilai ordinal (ASCII) karakter
    var i: Int

// konversi dari teks ke nilai ASCII
    c = 'a'
    i = c.toInt()
    println("karakter $c telah di ubah/dikonversi ke nilai ASCII $i")
// ckonversi dari nilai ASCII ke teks
    i = 98
    c = i.toChar()
    println("Nilai ASCII dari $i dikonversi ke nilai tekstualnya $c")
}