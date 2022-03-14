fun main() {
//    seperti java string juga meripakan objek yang memiliki fungsi anggota
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

//toUpperCase() dan toLowerCase()
    /*
    toUpperCase digunakan untuk mengubah nilai string ke nilai
    string yang terdiri dari huruf besar semua, toLowerCase digunakan
    untuk mengubah nilai string ke nilai string yang terdiri dari huruf kecil
    semua.
     */
    var config = "Fullscreen shaDows autosave"
    config = config.toLowerCase()
    println("Will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on?")
    println(config.contains("shadows"))
    println("Will sound be turned off?")
    println(config.contains("nosound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))

//replace()
    /*
    replace digunakan untuk mengganti setiap karakter string yang
    ditentukan parameter pertama dengan karakter yang ditentukan parameter kedua.
     */
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

//substring()
    println("I would not banish all of these Internets.".substring(2, 7))

//compareTo()
    println("alpha".compareTo("bravo"))
}