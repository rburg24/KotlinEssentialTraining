fun main(args: Array<String>) {
    val states = arrayOf("CA", "OR", "WA")

    var counter = 0

    printHeader("While Loop")
    while (counter < states.size) {
        println("State = ${states[counter]}")
        println("Counter = ${counter++}")
    }

    counter = 0


    printHeader("Do/While Loop")

    do {
        println("State = ${states.get(counter++)}")
    } while (counter < states.size)


}

fun printHeader(label: String) {
    println("***************")
    println(label)
    println("***************")
}
