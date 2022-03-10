fun main() {
//    variabel adalah sebuah wadah di dalam memori komputer untuk menyimpan data seperti nama pengguna, kata sandi, data waktu, jumlah makanan dan lainnya.

    /*
    dalam variabel terdapat 2 tipe sistem, tipe dinamis yaitu tipe yang tidak memerlukan adanya deklarasi tipe data pada
    sebuah variabel.
     */
    var dynamicVar = 2
    println("Contoh dynamic variabel = $dynamicVar")

    /*
    tipe kedua yaitu statis yaitu kebalikan dari tipe dinamis yaitu tipe yang mengharuskan kita mendeklarasikan jenis
    tipe data tertentu dalam sebuah variabel dan tipe data tersebut tidak bisa di ubah selama program di ekseskusi.
     */
    var staticVar: Char = 'A'
    println("contoh static variabel = $staticVar")
}