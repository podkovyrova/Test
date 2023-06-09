fun main() {
    var s = "Hello world"
    // Первый элемент строки
    println(s[0])
    println(s.first())
    // Последний элемент строки
    println(s[s.length-1])
    println(s.last())

    // функции startsWith и endsWith
    var cardNumber = "4377 7236 7334 8839"
    println(cardNumber.startsWith("4377"))
    println(cardNumber.endsWith("8839"))

    var a = "Hello"
    // Свойства заключаются в {}
    println("The length of $a is ${a.length}")

    // capitalize(), decapitalize(), toUpperCase(), toLowerCase()

//    val name = "John"

//    val newName = name.capitalize()
//    val newName = name.decapitalize()
//    val newName = name.toUpperCase()
//    val newName = name.toLowerCase()

    // Функции is Empty, isBlank
//    val emptyName = "\n"
//    val emptyName = "  "
//    println(emptyName.isBlank())
//    println(emptyName.isEmpty())

    // Функции, удаляющие пробелы trimStart() и trimEnd() и trim()
    val name = " John "
//    val newName = name.trimStart().trimEnd()
    val newName = name.trim()
    println(newName)

    // Функции replace() и split()
    val string = "Today today morning evening today"

    val newString = string.toLowerCase().replace("today", "*****")
    println(newString)

    val list = "milk,bread,oranges,kiwi"
    val arr = list.split(",")
    println(arr)


    // Ввод данных пользователем
    println("Enter your name")
    val input = readLine()
    println("Hello, $input")

    if (input?.toLowerCase()?.capitalize() == "John") {
        println("Access denied")
    } else {
        println("Welcome")
    }
    }

