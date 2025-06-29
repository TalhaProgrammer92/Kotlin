Here’s a guided overview of Kotlin fundamentals with code samples and explanations. It covers:

---

## 1. Basic Syntax & Variables

```kotlin
fun main() {
    val name: String = "Alice"   // immutable
    var age: Int = 30            // mutable

    println("Name: $name, Age: $age")
}
```

* `val` = read-only (like `final`), `var` = mutable
* String templates: `$name`, `${expression}`

---

## 2. Data Types & Nullable Types

```kotlin
fun main() {
    val x: Int = 10
    val y: Double = 3.14
    val flag: Boolean = true

    var z: String? = null     // nullable
    println(z?.length) // safe call -> null

    val length = z?.length ?: 0 // Elvis operator
    println("Length = $length")
}
```

* Kotlin tracks nullability in the type system
* `?.` – safe call, `?:` – default when null

---

## 3. Control Flow

```kotlin
fun main() {
    val score = 85
    if (score >= 90) {
        println("A")
    } else if (score >= 80) {
        println("B")
    } else {
        println("C")
    }

    // when expression (like switch)
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        else -> "C"
    }
    println("Grade: $grade")

    // loops
    for (i in 1..5) println(i)
    var j = 0
    while (j < 3) {
        println("j = $j")
        j++
    }
}
```

---

## 4. Functions & Lambdas

```kotlin
// Named function
fun sum(a: Int, b: Int): Int {
    return a + b
}

// Single-expression function
fun square(x: Int) = x * x

// Default & named args
fun greet(name: String = "Guest") = println("Hello, $name!")

// Higher-order function
fun applyTwice(x: Int, f: (Int) -> Int): Int {
    return f(f(x))
}

fun main() {
    println(sum(2, 3))
    println(square(4))
    greet()
    greet("Bob")

    val result = applyTwice(3) { it * 2 }
    println("Result: $result")
}
```

* `f: (Int) -> Int` is a function parameter
* Lambdas: `{ it * 2 }`, `it` is implicit

---

## 5. Object‑Oriented Programming (OOP)

```kotlin
// Base class
open class Animal(val name: String) {
    open fun speak() {
        println("$name makes a sound")
    }
}

// Derived class
class Dog(name: String, val breed: String) : Animal(name) {
    override fun speak() {
        println("$name barks!")
    }

    fun fetch() {
        println("$name is fetching!")
    }
}

fun main() {
    val animal: Animal = Dog("Buddy", "Labrador")
    animal.speak()  // polymorphism

    if (animal is Dog) {
        animal.fetch() // smart cast
    }
}
```

* `open`: class/method can be subclassed/overridden
* `override`: overrides a parent method
* `is` & smart casting

---

## 6. Interfaces & Data Classes

```kotlin
interface Shape {
    fun area(): Double
}

data class Rectangle(val width: Double, val height: Double): Shape {
    override fun area() = width * height
}

data class Circle(val radius: Double): Shape {
    override fun area() = Math.PI * radius * radius
}

fun main() {
    val shapes: List<Shape> = listOf(
        Rectangle(3.0, 4.0),
        Circle(2.5)
    )
    for (s in shapes) {
        println("Area = ${s.area()}")
    }

    // Data class toString(), equals(), copy()
    val r1 = Rectangle(5.0, 6.0)
    val r2 = r1.copy(width = 7.0)
}
```

* `data class`: auto-generates useful methods
* Interface defines behavior; classes implement it

---

## 7. Collections & Functional Operations

```kotlin
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evens = numbers.filter { it % 2 == 0 }
    val doubled = numbers.map { it * 2 }
    val sum = numbers.fold(0) { acc, x -> acc + x }

    println("Evens: $evens")
    println("Doubled: $doubled")
    println("Sum: $sum")
}
```

* `filter`, `map`, `fold`, `forEach`, `reduce`, `groupBy`, etc.
* Very expressive functional style

---

## 8. File Handling (Basic)

```kotlin
import java.io.File

fun main() {
    // Write text
    val file = File("output.txt")
    file.writeText("Hello, Kotlin!\n")

    // Append
    file.appendText("Appended line.\n")

    // Read all text
    val content = file.readText()
    println("Content:\n$content")

    // Read line-by-line
    file.forEachLine { line ->
        println("Line: $line")
    }
}
```

* Uses `java.io.File`
* `writeText`, `appendText`, `readText`, `forEachLine`

---

## 9. Putting OOP + Functions + File I/O Together

```kotlin
import java.io.File

// Define a simple logger class
class Logger(private val logFile: String) {
    fun log(message: String) {
        File(logFile).appendText("${System.currentTimeMillis()}: $message\n")
    }
}

fun analyzeData(data: List<Double>): Double {
    return data.average()
}

fun main() {
    val logger = Logger("app.log")
    logger.log("Application started")

    val numbers = listOf(10.0, 20.0, 30.0)
    val avg = analyzeData(numbers)
    println("Average = $avg")

    logger.log("Computed average: $avg")
}
```

---

### ✅ Next Steps & Tips

* Practice by writing small console programs.
* Explore Kotlin REPL (in IntelliJ or command-line).
* Learn about coroutines for async programming.

Let me know if you'd like sample projects (e.g. CLI calculator), more advanced concepts (e.g. generics, coroutines), or help with a specific domain!
