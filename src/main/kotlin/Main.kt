fun main() {
    val answer = getAnswer("My question")

    println(answer?.toUpperCase())
    // Если мы уверены, что null точно не будет - можно ставить "!!"
//    println(answer!!.toUpperCase())
}

fun getAnswer(question: String): String? {
    var answer: String? = null

    if (question.length < 10) {
        answer = "This is your answer"
    }
    return answer
}