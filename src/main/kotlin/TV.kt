class TV {
    private val channels = arrayOf("BBC", "FOX", "2x2")
    private var currentChannel = channels[0]
    private var type = "AM"
    private var frequency = 200

    fun getChannels() = channels

    override fun toString(): String {
        return this.toString()
    }

    fun watch(channelNumber: Int) {
        currentChannel = channels[channelNumber]

        when (channelNumber) {
            0 -> {
                type = "AM"
                frequency = 200
            }
            1 -> {
                type = "FM"
                frequency = 95
            }
            2 -> {
                type = "AM"
                frequency = 150
            }
        }
        println("You are watching $currentChannel. Channel type is $type. Channel frequency is $frequency")
    }

}