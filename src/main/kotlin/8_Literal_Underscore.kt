fun main() {
/*
pemakaian underscore di dalam literal yang berguna untuk memberikan kemudahan pada
developer agar tidak keliru dalam membaca dan menulis kode program.
 */

//    contoh penulisan onemillion (1 juta) menggunakan underscore agar jelas nol nya, dan agar pengembang tidak keliru.
    val oneMillion = 1_000_000

//    contoh penulisan creditcarnumber (nomor kartu kredit)
    val creditCardNumber = 1234_5678_9812_3456L

//     contoh penulisan socialSecurityNumber (nomor ktp)
    val socialSecurityNumber = 999_99_9999L

//    contoh penulisan hexBytes
    val hexBytes = 0xFF_EC_DE_5E

//    contoh penulisan bytes.
    val bytes = 0b11010010_01101001_10010100_10010010

//    mencetak nilai sesuai dengan keterangan di atas. Tanda= " + bisa di ganti $ (string).
    println("oneMillion = " + oneMillion)
    println("creditCardNumber = $creditCardNumber")
    println("socialSecurityNumber = " + socialSecurityNumber)
    println("hexBytes = $hexBytes")
    println("bytes = $bytes")
}