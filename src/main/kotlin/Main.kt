val passportNumbers = listOf("WE934", "FR532", "HH663")
val persons = listOf("Ivan Ivanov", "Boris Borisov","Petr Petrov", "Elon Musk")
fun main() {
    println(getPersonByPassportNumber("HH663"))
}

fun getPersonByPassportNumber(number: String): String {
    val i = passportNumbers.indexOf(number)
    val person = persons[i]

    return person
}