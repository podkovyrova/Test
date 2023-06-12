fun main() {
    var house = Building()
    println(house.floors)


    var house1 = Building()

    house1.floors = 3
    house1.length = 7
    house1.width = 7

    println(house1.floors)

    house1.destroy()
}