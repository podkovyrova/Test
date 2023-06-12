import kotlin.math.exp
import kotlin.system.exitProcess

fun main() {

    val moscowCoffeeshop = MoscowCoffeeshop(3.0, 4.50, 5.0)
    val newYorkCoffeeshop = NewYorkCoffeeshop(5.0, 7.50, 8.0)
    var currentCoffeeshop: Coffeeshop

    while (true) {
        println("Hello! Choose a city")
        println("1. Moscow\n2. New York\n\n0. Exit")

        currentCoffeeshop = when (readLine()) {
            "1" -> moscowCoffeeshop
            "2" -> newYorkCoffeeshop
            "0" -> break
            else -> {
                println("Error")
                continue
            }
        }

        chooseDrink(currentCoffeeshop)
    }
}

private fun chooseDrink(currentCoffeeshop: Coffeeshop) {
    println("Choose a drink")
    println("1. Americano\n2. Cappuchino\n3. Latte\n\n0. Show statistics")

    when (readLine()) {
        "1" -> {
            currentCoffeeshop.makeAmericano()
            checkAndAskForBuiscits(currentCoffeeshop)
        }

        "2" -> {
            currentCoffeeshop.makeCappuchino()
            checkAndAskForBuiscits(currentCoffeeshop)
        }

        "3" -> {
            currentCoffeeshop.makeLatte()
            checkAndAskForBuiscits(currentCoffeeshop)
        }

        "0" -> currentCoffeeshop.showStatistics()
        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}

private fun checkAndAskForBuiscits(currentCoffeeshop: Coffeeshop) {
    if (currentCoffeeshop is Biscuits) {
        println("Would you like biscuits?")
        println("1. Yes\n2. No")

        val isBiscuits = readLine()

        if (isBiscuits == "1") {
            currentCoffeeshop.sellBiscuits()
        }
    }
}