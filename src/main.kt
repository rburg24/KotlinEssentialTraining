fun main(args: Array<String>) {


    var aString = "Hello!"

    println(aString)


    var empty = String()

    println("'$empty'")


    val charArray = aString.toCharArray()

    println(charArray.toList())
    val byteArray = aString.toByteArray()

    println(byteArray.toList())


    aString += " and Welcome!"

    println(aString)

    val len = aString.length

    for (i in 0 until len){
        val c = aString.get(i)
        println(c)
    }


}