class MoscowCoffeeshop(americanoPrice: Double, cappuchinoPrice: Double, lattePrice: Double):
    Coffeeshop(americanoPrice, cappuchinoPrice, lattePrice) {
    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in Moscow Coffee Shop")
    }

    override fun makeCappuchino() {
        cappuchinoCount++
        println("Thanks for order Cappuccino in Moscow Coffee Shop")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in Moscow Coffee Shop")
    }

}