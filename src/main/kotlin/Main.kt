fun main() {
    val emailService = EmailService()
    val smsService = SMSService()


    emailService.sendMessage("Kate@", "Eva@", "Hi")
    smsService.sendMessage("89871997624", "89150407354", "Via SMS")
}

