
//fun myFunc(arr: Array<String>, count: Int) {
//    for (i in arr) {
//        when (i) {
//            "Bob" -> println("Access denied $count times")
//            "Peter" -> println("Welcome, Peter")
//            else -> println("Who are you?")
//        }
//    }
//}

fun main() {
//    val names = arrayOf("John", "Bob", "Peter")
//    myFunc(names, 3)
//
//    if (readLine() == "Get all names") {
//        myFunc(names, 5)
//    }
    var x = 2
    var y = 3

    val result = add(x, y)

    println(result)
}

fun add(x: Int, y: Int): Int {
    return x + y
}

// Сокращение однострочной функции
// fun add(x: Int, y: Int): Int = x + y
