abstract class Animal(protected val voice: String) {
    open val maxAge = 100

    init {
        println("Инициализация объекта")
    }
    open fun sleep() {
        println("I am sleeping")
    }

    protected open fun makeVoice() {
        println(voice)
    }

    abstract fun eat()
}