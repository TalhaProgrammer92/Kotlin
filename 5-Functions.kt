// * Get sum
fun get_sum(x: Int, y: Int): Int {
    return x + y
}

// * Get integer input from user
fun get_input(message: String?): Int {
    print("$message")
    val x: Int = readln().toInt()
    return x
}

fun main() {
    // * Get two numbers from user
    val a: Int = get_input("Enter first number: ")
    val b: Int = get_input("Enter second number: ")

    // * Show sum
    val s: Int = get_sum(a, b)
    println("a + b = $a + $b = $s")
}