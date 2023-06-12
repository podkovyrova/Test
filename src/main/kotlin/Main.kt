fun main() {
    println("hello! it's a calculator")

    while(true) {
        println("Enter a number")

        val first = readLine()?.toDoubleOrNull()

        println("Enter one more number")

        val second = readLine()?.toDoubleOrNull()

        println("Enter an operator (+, -, *, /)")

        val operator = readLine()

        if (first == null || second == null || operator.isNullOrEmpty()) {
            println("Lets try again")
        } else {
            var result = calculate(first, second, operator)

            println("Result is $result")
        }
    }

}

fun calculate(fir: Double, sec: Double, op: String): Double {
    var res = 0.0

    when (op) {
       "+" -> res = fir + sec
        "-" -> res = fir - sec
        "*" -> res = fir * sec
        "/" -> res = fir / sec
    }
    return res
}