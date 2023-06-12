import kotlin.math.exp
import kotlin.system.exitProcess

fun main() {

    val moscowCoffeeshop = MoscowCoffeeshop(3.0, 4.50, 5.0)
    val newYorkCoffeeshop = NewYorkCoffeeshop(5.0, 7.50, 8.0)
    var currentCoffeeshop: Coffeeshop

    println("Hello! Choose a city")
    println("1. Moscow\n2. New York")

    currentCoffeeshop = when (readLine()) {
        "1" -> moscowCoffeeshop
        "2" -> newYorkCoffeeshop
        else -> {
            println("Error")
            exitProcess(1)
        }
    }

    println("Choose a drink")
    println("1. Americano\n2. Cappuchino\n3. Latte")

    when (readLine()) {
        "1" -> currentCoffeeshop.makeAmericano()
        "2" -> currentCoffeeshop.makeCappuchino()
        "3" -> currentCoffeeshop.makeLatte()
        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}