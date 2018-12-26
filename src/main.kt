fun main(args: Array<String>) {

    print("Enter a state abbreviation: ")

    val state = readLine()

/*    if(state.equals("CA")) println("The capital is Sacramento")
    else if(state.equals("OR")) println("The capital is Salem")
    else  println("I don't know that state")*/

    val  capital = when(state){
        "CA" -> "Sacramento"
        "OR" -> "Salem"
        else -> "Unknown"
    }

    println("The capital is  $capital")

}