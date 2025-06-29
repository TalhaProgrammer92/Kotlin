fun main()
{
    // * Some variables
    val pi: Float = 3.14f   // ! 'f' is must with float datatypes otherwise compiler will treat it as double
    var price: Double = 1456.87
    val programmable: Boolean = true

    var s: String? = null   // * Nullable i.e. now it can hold null
    println(s?.length)      // * Safe call

    val length = s?.length ?: 0 // * elvis operator i.e. if the string is null -> return 0 otherwise length of the string
    println("Length = $length")
}