fun main() {
    val a = "Hello"
    val b = a.getThirdLetter()
    String
    println(b)


}

fun String.getThirdLetter(): Char {
    return this[2]
}