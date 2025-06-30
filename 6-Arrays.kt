fun main()
{
    // * Variable/Array
    var numbers = arrayOf(1, 2, 3, 4, 5, 6)
    var sum: Int = 0

    // * Calculating sum
    for (num in numbers) sum += num

    // * Displaying sum
    println("Sum = $sum")
}