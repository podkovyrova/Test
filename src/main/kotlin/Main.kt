fun main() {
    val money = Money(10000000)
    val jewerly = Jewerly("Brilliant")

    val moneyCase = Case(money)

    println(moneyCase.get())
    moneyCase.add(Money((5000)))
    println(moneyCase.get())



    val jeweleryCase = Case(jewerly)

    println(jeweleryCase.get())
    jeweleryCase.add(Jewerly("Rings"))
    println(jeweleryCase.get())
}

