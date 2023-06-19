fun main() {
//    val a = "Hello"
//    val b = a.getThirdLetter()
//
//    println(b)

//    val arr = arrayOf("a", "b", "c")
//    arr.swap(1, 2)
//    arr.print()

    val dog = Dog()
    dog.bark()
    dog.sleep()

}

fun String.getThirdLetter(): Char {
    return this[2]
}

fun <T> Array<T>.swap(i1: Int, i2: Int) {
    val el1 = this[i1]
    val el2 = this[i2]
    this[i1] = el2
    this[i2] = el1
}

fun <T> Array<T>.print() {
    for (i in this) {
        println(i)
    }
}

class Dog {
    fun bark() {
        println("Woof!")
    }
}

//fun Dog.bark() {   Расширенная функция bark() не будет выполняться, так как она в классе уже существует
//    println("Meow")
//}

fun Dog.sleep() {
    println("Dog is sleeping")
}