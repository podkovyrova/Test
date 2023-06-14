class SMSService: MessageService() {

    override fun sendMessage(sender: String, receiver: String, message: String) {
        if (sender.length == 11 && receiver.length == 11)
            super.sendMessage(sender, receiver, message)
    }
}