//import java.lang.Exception
//import kotlin.Exception

fun main() {
    test()

}

fun test() {
    val a = 10
    val b = 2

    val tel = 7987199872

    try {
         validate(tel)
    } catch (e: ValidationException) {
        println(e.message)
    } catch (e: CharacterCodingException) {
        println("$e - исключение")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("$e - исключение")
    }

}

fun validate(tel: Long) {
    if (tel.toString().length < 11) {
        throw ValidationException("Ошибка при валидации номера телефона")
    }
}

//fun hi() {
////    throw CharacterCodingException()
//}
//
//fun sendMessage() {
//    throw ArrayIndexOutOfBoundsException()
//}

