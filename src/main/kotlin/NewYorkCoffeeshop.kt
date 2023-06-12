class NewYorkCoffeeshop(americanoPrice: Double, cappuchinoPrice: Double, lattePrice: Double):
    Coffeeshop(americanoPrice, cappuchinoPrice, lattePrice) {
    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in New York Coffee Shop")
    }

    override fun makeCappuchino() {
        cappuchinoCount++
        println("Thanks for order Cappuccino in New York Coffee Shop")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in New York Coffee Shop")
    }

}