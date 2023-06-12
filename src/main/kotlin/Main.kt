fun main() {
    var house1 = Building(6, 20.0,10.0)
    var house2 = Building(1, 3.0,5.0)

    var house3 = Building()

    // Ввод свойств в разном порядке с указанием свойства
    var house4 = Building(length = 6.5, width = 8.3, floors = 4)

    println(house3.floors)

}