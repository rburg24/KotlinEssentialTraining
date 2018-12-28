fun main(args: Array<String>) {
    val item = ClothingItem("Shirt", "L", 19.99)
    println(item)

    item.price = 15.99
    println(item)

    val item2 = ClothingItem("M", 14.99)


    item2.price = 10.0


    println(item2)

    println("Item type = ${item2.type}")
    println("Item price = ${item2.price}")

    val person = Person("John","Smith")

    println(person)
    println(person.fullName)


}
