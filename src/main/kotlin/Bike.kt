class Bike: Vehicle() {
    override val numberOfWheels = 2
    override fun move() {
        println("Начинаю крутить педали")
        println("Начинаю движение")
    }
}