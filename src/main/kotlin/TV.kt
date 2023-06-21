class TV {
    val channels = arrayOf("BBC", "FOX", "2x2")
    var currentChannel = channels[0]
    var type = "AM"
    var frequency = 200

    fun watch() {
        println("You are watching $currentChannel")
    }

}