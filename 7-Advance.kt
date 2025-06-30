import java.io.File

// ? Classes

// * Base class
open class Animal(val name: String) {
    open fun speak() {
        println("$name makes a sound")
    }
}

// * Derived class
class Dog(name: String, val breed: String) : Animal(name) {
    override fun speak() {
        println("$name barks!")
    }

    fun fetch() {
        println("$name is fetching!")
    }
}

// ? Interfaces

// * Interface (Base)
interface Shape {
    fun area(): Double
}

// * Generate methods for Shape (Interface)
data class Rectangle(val width: Double, val height: Double): Shape {
    override fun area() = width * height
}

// * Generate methods for Shape (Interface)
data class Circle(val radius: Double): Shape {
    override fun area() = Math.PI * radius * radius
}

fun main() {
    // ? Classes & Objects
    val animal: Animal = Dog("Buddy", "Labrador")
    animal.speak()  // * Polymorphism

    if (animal is Dog) {
        animal.fetch() // * Smart cast
    }

    // ? Interfaces & Data objects

    // * List can store data of different types just like Python lists
    val shapes: List<Shape> = listOf(
        Rectangle(3.0, 4.0),
        Circle(2.5)
    )
    for (s in shapes) {
        println("Area = ${s.area()}")
    }

    // * Data class toString(), equals(), copy()
    val r1 = Rectangle(5.0, 6.0)
    val r2 = r1.copy(width = 7.0)

    // ? Collections & Functional Operators

    val numbers = listOf(1, 2, 3, 4, 5)
    val evens = numbers.filter { it % 2 == 0 }
    val doubled = numbers.map { it * 2 }
    val sum = numbers.fold(0) { acc, x -> acc + x }

    println("Evens: $evens")
    println("Doubled: $doubled")
    println("Sum: $sum")

    // ? File Handling

    // * Write text
    val file = File("output.txt")
    file.writeText("Hello, Kotlin!\n")

    // * Append
    file.appendText("Appended line.\n")

    // * Read all text
    val content = file.readText()
    println("Content:\n$content")

    // * Read line-by-line
    file.forEachLine { line ->
        println("Line: $line")
    }
}