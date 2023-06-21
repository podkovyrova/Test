fun main() {
    val passports = mapOf(
        "EK392" to "Ivan Ivanov",
        "HH934" to "Petr Petrov",
        "EM66" to "Elon Musk",
        "EM66" to "Elon Musk 2", // Последний запишется
        null to "Max Petrov", // Так делать можно, но не нужно
        "EN222" to null // Так тоже
    )
    val person = passports["EM66"]
//    println(person) // Elon Musk 2
//    println(passports[null])
//    println(passports.values) // Значения
//    println(passports.keys) // Ключи
//    println(passports.size) // Размер мапы
//    println(passports.entries) // Возвращает пары ключ-значение
//    println(passports.containsKey("EM66")) // true / false


    val telephones = mapOf(
        12345 to 16.32,
        12245 to 165.52,
        12545 to 35.32
    )
//    println(telephones.get(12245))

    val books = mapOf(
        "Ivan Ivanov" to listOf("Book 1", "Book 2"),
        "Elon Musk" to listOf("SpaceX", "DOGE is not skam")
    )

//    println(books["Elon Musk"])



    // Muteble - изменяемые мапы
    val mutablePassports = mutableMapOf(
        "EK392" to "Ivan Ivanov",
        "HH934" to "Petr Petrov",
        "EM66" to "Elon Musk",
    )
    // put - добавление пары в мапу
//    mutablePassports.put("JD883", "Kate Moss")
    mutablePassports["JD883"] = "Kate Moss"
    println(mutablePassports)
    // replace - заменить значение существующего ключа
    mutablePassports.replace("JD883", "Walter White")
    println(mutablePassports)
    // remove - удаляем пару по ключу
    mutablePassports.remove("JD883")
    println(mutablePassports)
    // clear - почистить мапу
//    mutablePassports.clear()
//    println(mutablePassports)
    // putAll - принимает другие мапы


    // Работа с циклами в мапе
    for (i in mutablePassports) {
        println(i)
    }

    // EK392=Ivan Ivanov
    // HH934=Petr Petrov
    // EM66=Elon Musk

    for (i in mutablePassports) {
        println(i.key)
        println(i.value)
    }
    // EK392
    // Ivan Ivanov
    // HH934
    // Petr Petrov
    // EM66
    // Elon Musk
}

