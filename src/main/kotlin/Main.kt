fun main() {
    // public (позволяет иметь доступ откуда угодно)
    // private (доступ только в месте объявления)
    // protected (как и private + наследники)
    val dog = Dog("Woof")
    dog.info()
}