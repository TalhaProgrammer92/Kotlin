fun main()
{
    // * Get number from user
    print("Enter a number: ")
    val limit = readln().toInt()

    // * Print a series - while
    var i = 0
    while (i < limit)
        println(++i)
    println()

    // * Print a series - for
    for (i in 1..limit) println(i)
}