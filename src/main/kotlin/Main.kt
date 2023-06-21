fun main() {

    // Arrays
    val fruitsArray = arrayOf("apple", "orange", "lemon")
    fruitsArray[2] = "peach"
//    println(fruitsArray[2])

    fruitsArray.get(0)
    fruitsArray.set(0,"banana")

    // List
    var fruitsList = listOf("apple", "orange", "lemon", "apple")

    println(fruitsList.last()) // Вернет последний элемент
    println(fruitsList.indexOf("lemon")) // Вернет индекс элемента
    println(fruitsList.lastIndexOf("apple")) // Последний индекс элемента при дублировании данных
    println(fruitsList.subList(0, 3)) // Возвращает несколько элементов внутри массива по индексу [Int; Int)

    // MUTABLE - List с изменяемыми элементами
    var mutableFruitsList = mutableListOf("apple", "orange", "lemon", "banana", "lime")

    mutableFruitsList[1] = "peach"
    // remove - удаление элемента в массиве по значению
    mutableFruitsList.remove("lemon")
    println(mutableFruitsList)
    // removeAt - удаление элемента в массиве по индексу
    mutableFruitsList.removeAt(0)
    println(mutableFruitsList)
    // removeAll - удалить несколько переданных элементов (в скобках другой лист)
    mutableFruitsList.removeAll(listOf("peach", "lime"))
    println(mutableFruitsList)
    // set() - такая же как и в обычном массиве
    mutableFruitsList.set(0, "avocado")
    println(mutableFruitsList)
    // clear - очистить массив
    mutableFruitsList.clear()
    println(mutableFruitsList)

    // add() - добавление новых элементов
    mutableFruitsList.add("kiwi")
    println(mutableFruitsList)
    // add() - добавить в опеределенное место
    mutableFruitsList.add(0, "mango")
    println(mutableFruitsList)
    // addAll() - добавить сразу несколько элементов
    mutableFruitsList.addAll(listOf("watermelon", "melon"))
    println(mutableFruitsList)
}