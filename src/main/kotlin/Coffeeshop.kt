abstract class Coffeeshop(val americanoPrice: Double, val cappuchinoPrice: Double, val lattePrice: Double) {
    var americanoCount = 0
    var cappuchinoCount = 0
    var latteCount = 0

    abstract fun makeAmericano()
    abstract fun makeCappuchino()
    abstract fun makeLatte()

    fun showStatistics() {
        println("Americano sold: $americanoCount")
        println("Cappuccino sold: $cappuchinoCount")
        println("Latte sold: $latteCount")

        val money = americanoCount * americanoPrice + cappuchinoCount * cappuchinoPrice + latteCount * lattePrice
        println("Money earned: $money")
    }
}