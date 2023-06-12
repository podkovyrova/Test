class Dog(name: String, voice: String): Animal(name, voice) {
    override fun sleep() {
        println("$name is sleeping outside the house")
    }
}