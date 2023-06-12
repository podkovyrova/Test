abstract class Coffeeshop(val americanoPrice: Double, val cappuchinoPrice: Double, val lattePrice: Double) {
    var americanoCount = 0
    var cappuchinoCount = 0
    var latteCount = 0

    abstract fun makeAmericano()
    abstract fun makeCappuchino()
    abstract fun makeLatte()
}