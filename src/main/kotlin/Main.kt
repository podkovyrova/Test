fun main() {
    var age: Int

    age = 76

    if (age >= 21) {
        if (age > 75) {
            println("You're old")
        } else {
            println("You are more 21")
        }
    } else if (age in 20 .. 18 ) {
        println("You are more 18 and less 21")
    } else {
        println("Permission denied")
    }

    when (age) {
        18 -> {println("18")}
        21 -> {println("21")}
        else -> {println("I Dont Know")}
    }

}

