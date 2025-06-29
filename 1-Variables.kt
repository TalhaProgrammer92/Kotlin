fun main() {
    val name: String = "Talha Ahmad"    // * immutable
    var age: Int = 19                   // * mutable
    age++
    // name += " Error"    // ! Will raise error

    println("Name: $name, Age: $age")
}