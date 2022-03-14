fun main(args: Array<String>) {
/*
program untuk mencari huruf konsonan, huruf vocal dan karakter lainnya(selain huruf
konsonan dan vocal) dalam sebuah String.
 */

// string yang ingin di analisa
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash, and Repeat."
    println(s)
    s = s.toLowerCase()

// penghitung inisialisasi
    var vowelCount = 0
    var consonantCount = 0

// definisi kelompok karakter
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

// main loop
    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }
    println("Vokal: $vowelCount")
    println("Konsonan: $consonantCount")
    println("karakter lainnya: ${s.length - (vowelCount + consonantCount)}")
}