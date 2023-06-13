class User (var passportNumber: String, val lastName: String, val age: Int){
//    override fun toString(): String {
//        return "User [ First name: $passportNumber, Last Name: $lastName, Age: $age ]"
//    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        return passportNumber == other.passportNumber
    }

    override fun hashCode(): Int {
        return passportNumber.hashCode()
    }


}