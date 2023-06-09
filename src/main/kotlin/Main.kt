fun main() {
    var isDownloaded = true

    // 1. While
//    while (!isDownloaded) {
//        println("File is downloading")
//    }

    // 2. Do ... While - условие выполнится минимум 1 раз
//    do {
//        println("File is downloading")
//    } while (!isDownloaded)

    // 3. For
    for (i in 100 downTo 10 step 2) {
        println("File is downloading $i time")
    }
    println("Finished")

}

