class Cat(name: String, voice: String): Animal(name, voice) {
    override fun sleep() {
        println("$name is sleeping on the bed")
    }
}