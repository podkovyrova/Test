class TV {
    private var channels = arrayOf("BBC", "FOX", "2x2")
    private var currentChannel = channels[0]
    private var type = "AM"
    private var frequency = 200

    fun getChannels(): Array<String> {
        return channels
    }

    fun setChannels(newChannels: Array<String>) {
        channels = newChannels
    }

    private fun setFrequencyAndType(channelNumber: Int) {
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
    }

    fun watch(channelNumber: Int) {
        currentChannel = channels[channelNumber]
        setFrequencyAndType(channelNumber)

        println("You are watching $currentChannel. Channel type is $type. Channel frequency is $frequency")
    }

}