
fun main(args: Array<String>) {


    try {
        print("Value1: ")

        val value1 = readLine()
        val d1 = value1!!.toDouble()


        print("Value2: ")

        val value2 = readLine()
        val d2 = value2!!.toDouble()

        val sum = d1 + d2

        println("Answer: $sum")

    } catch (e: KotlinNullPointerException) {
        print("1 We have an error!!!!! :: ${e.message}")
    }catch (e:NumberFormatException){
        print("2 We have an error!!!!! :: ${e.message} is not a number")
    }

}