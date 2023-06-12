class Dog(voice: String): Animal(voice) {
    override val maxAge = 20

    init {
        println("Инициализация объекта")
    }
    override fun sleep() {
        super.sleep()
        println(voice)
        println("I am a dog")
        makeVoice()
    }

     public override fun makeVoice() {
        super.makeVoice()
        println("Hi")
    }
    override fun eat() {
        println("I am eating")
//        println(voice)
    }

     fun info() {
        println("Dog max age is $maxAge")
        println("Animal max age is " + super.maxAge)
    }
}