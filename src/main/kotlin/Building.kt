class Building(var floors: Int = 5, var length: Double = 10.0, var width: Double = 10.0) {

    fun build(a: Int, b: Float) {

    }

    fun square():Double {
        return length * width
    }

    fun destroy() {
        println("Destroying...")
    }
}