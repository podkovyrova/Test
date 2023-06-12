class Car() : Vehicle(), Moveable, Stoppable {
    override val numberOfWheels = 4
    override fun info() {
        println("Some info")
    }

    override fun move() {
        a = 10
        println("Завожу двигатель")
        println("Начинаю движение")
    }

    override val speed: Double = 150.0
    override fun stop() {
        println("Торможу")
    }

}