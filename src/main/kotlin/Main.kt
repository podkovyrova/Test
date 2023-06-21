fun main() {
    // В сетах данные не могут повторяться
    val mySet = setOf<String>("apple", "banana", "orange", "apple", "kiwi")
    println(mySet)
    mySet.toString()
    /*
    [apple, banana, orange]
     */

    // containts() - проверяет есть ли зачение в сете (true / false)
    val contains = mySet.contains("banana")
    println(contains)

    // mutable
    var mutableSet = mutableSetOf("apple", "banana", "orange", "apple", "watermelon")
    println(mutableSet)

    // add - добавить новый элемент
    mutableSet.add("mango")
    println(mutableSet)

    // union - объединение двух сетов
    val unionedSet = mySet.union(mutableSet)
    println(unionedSet)

    // intersect - вывести общие элементы для двух сетов
    val intersectedSet = mySet.intersect(mutableSet)
    println(intersectedSet)

    // substract - вычесть из первого сета второй сет
    val substractedSet = mySet.subtract(mutableSet)
    println(substractedSet)
}

