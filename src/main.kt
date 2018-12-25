fun main(args: Array<String>) {
    val myInt = 42
    val myLong: Long = myInt.toLong()


    println("The type of myLong is ${myLong::class.qualifiedName}")

    val myLong2 = 42.9

    var myInt2 = myLong2.toInt()

    println("The value of myLong2 is $myLong2")

    println("The value of myInt2 is $myInt2")


    var myInt3 = 568

    val myDouble3 = myInt3.toDouble()

    println("The value of myDouble3 is $myDouble3")
}