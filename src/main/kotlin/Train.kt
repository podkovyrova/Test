class Train() : Moveable, Stoppable {
    override val speed: Double = 300.0
    override fun move() {
        println("Чух-чух-чух")
    }

    override fun stop() {
        println("The train was stopped! Чух-чух...")
    }

}