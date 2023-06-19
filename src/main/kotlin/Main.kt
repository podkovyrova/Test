fun main() {
//    val moneyCase = Case<Money, Double>(Money(1000000), 12.5)
//
//    println(moneyCase.get())
//    println(moneyCase.get2())
//    moneyCase.add(Money((5000)))
//    println(moneyCase.get())
//
//
//
//    val jeweleryCase = Case<Jewerly, Char>(Jewerly("Brilliant"), 'A')
//
//    println(jeweleryCase.get())
//    println(jeweleryCase.get2())
//    jeweleryCase.add(Jewerly("Rings"))
//    println(jeweleryCase.get())

    sayHiAndPrint("John")
    sayHiAndPrint(Money(1000000))
    sayHiAndPrint(Case(Money(500), "USD"))
}

fun <T> sayHiAndPrint(item: T) {
    println("Hi $item")
}