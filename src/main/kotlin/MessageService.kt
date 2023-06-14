abstract class MessageService {
    open fun sendMessage(sender: String, receiver: String, message: String) {
            println("Send message: \"$message\" from $sender to $receiver ")
    }

}