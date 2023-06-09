fun main() {
    var list: Array<Int>  = arrayOf(11, 12, 13, 14, 15)
    var names = arrayOf("Kate", "Mary", "Chloe")

//    println(list[0])
//    println(names[0])
//
//    names[0] = "Catherine"
//    println(names[0])

    // Обращение к массивам через get и set
//    println(names.get(1))
//    names.set(1, "Bob")
//    println(names.get(1))

    // size - размер массива
//    println(list.size)

    // Перебор массивов
//    for (i in names) {
//        println(i)
//    }

    // forEachIndexed - index + element
    list.forEachIndexed() { index, element ->
        println("$element has index $index")
    }

    // forEachIndexed - only element
    names.forEach { currentElement ->
        if (currentElement == "Kate") {
            print("Hello, ")
        }
        println(currentElement) }
    }

