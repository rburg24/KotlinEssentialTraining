import MathLib.Companion.addValues
import MathLib.Companion.getInput

fun main(args: Array<String>) {
    try {
        val number1 = getInput("Number 1: ")

        val number2 = getInput("Number 2: ")


        val result: Double? = addValues(number1, number2)

        println("The answer is $result")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}




