//import java.lang.Exception
//import kotlin.Exception

fun main() {
//    Exception in thread "main" java.lang.ArithmeticException: / by zero
    val a = 10
    val b = 0

    try {
        println(a / b)
    } catch (e: ArithmeticException) {
        println("Попытка деления на 0")
    }


//    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//    val a = arrayOf(1, 2)
//    for (i in 0..5) {
//        println(a[i])
//    }
//    test()
}

//    Exception in thread "main" java.lang.StackOverflowError
//fun test() {
//    test()
//}
