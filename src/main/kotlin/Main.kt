fun main() {
    // В сетах данные не могут повторяться
    val mySet = setOf<String>("apple", "banana", "orange", "apple")
    println(mySet)
    mySet.toString()
    /*
    [apple, banana, orange]
     */

    // containts() - проверяет есть ли зачение в сете (true / false)
    val contains = mySet.contains("banana")
    println(contains)

    // mutable
    var mutableSet = mutableSetOf("apple", "banana", "orange", "apple")
    println(mutableSet)

    // add - добавить новый элемент
    mutableSet.add("mango")
    println(mutableSet)

    //
}

