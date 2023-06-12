open class Animal(val name: String, val voice: String) {
    open fun sleep() {
        println("$name is sleeping")
    }

    open fun makeVoice() {
        println(voice)
    }
}