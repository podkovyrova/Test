abstract class Vehicle {

    abstract val numberOfWheels: Int

    var a = 5

    open fun info() {
        println("Number of wheels id $numberOfWheels")
    }

    abstract fun move()
}