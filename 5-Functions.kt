// * Get sum
fun get_sum(x: Int, y: Int) Int
{
    return x + y
}

// * Get integer input from user
fun get_input(message: String) Int
{
    print(message)
    val x = readln.toInt()
    return x
}

fun main()
{
    // * Get two numbers from user
    val a = get_input("Enter first number: ")
    val b = get_input("Enter second number: ")

    // * Show sum
    val s = sum(a, b)
    println("a + b = $a + $b = ")
}