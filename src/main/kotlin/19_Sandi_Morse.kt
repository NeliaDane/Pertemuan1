fun main(args: Array<String>) {
//Program sandi morse
    /*
    Program ini membaca atau mengkonversi sebuah input text String berbentuk sandi Morse
    kedalam plain teks.
     */

// string yang ingin di decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

// the string with the decoded message
    var message = ""

// mendefinisi array
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

// memilah string menjadi karakter morse
            val characters = s.split(" ")

// mengulangi karakter Morse
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)

// karakter yang di temukan
        if (index != -1) {
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}