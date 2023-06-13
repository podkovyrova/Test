import kotlin.concurrent.fixedRateTimer

fun main() {
    val user1 = User("34655432", "Lock", 25)
    val user2 = User("34655432", "Lock", 25)

    println(user1)
    println(user2)

    println(user1 == user2)

    println(user1.hashCode())
    println(user2.hashCode())

}

