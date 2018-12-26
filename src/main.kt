fun main(args: Array<String>) {
    val num1 = 4.0
    val num2 = 3.5

    val result = addValues(param2 = num2, param1 = num1)

    println("The result is $result")

    val result2 = calcValues(param2 = num2, param1 = num1, op = "-")

    println("The result2 is $result2")

    changeSomething(param = 5.0)

    val sum: Int =addValues(1,3,5,7)

    println("The sum is $sum")

}

fun addValues(param1: Double, param2: Double): Double {
    return param1.plus(param2)

}

fun calcValues(param1: Double, param2: Double, op: String = "+"): Double {

    var result: Double = -1.0

    if (op.equals(other = "-")) {
        result = param1.minus(param2)
    } else if (op.equals(other = "+"))  {
        result = param1.plus(param2)
    }

    return result
}


fun changeSomething (param:Double){
    var copy = param
    copy++

    println("Copy is $copy")

}

fun addValues(vararg numbers:Int ):Int{
    var result = 0

    for (i in numbers){
        result += i
    }

    return result
}