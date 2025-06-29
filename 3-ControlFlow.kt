fun main()
{
    // * Take marks from user
    print("Enter your marks: ")
    val marks: Int = readln().toInt()

    // * Assign grade - Method (if-else)
    if (marks >= 90)
        println("Grade: A")
    else if (marks >= 80)
        println("Grade: B")
    else if (marks >= 70)
        println("Grade: C")
    else if (marks >= 60)
        println("Grade: D")
    else if (marks >= 50)
        println("Grade: E")
    else
        println("Grade: F")

    // * Assign grade - Method (switch/when)
    val grade = when (marks)
    {
        // ! in [range = n..m]
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 50..59 -> "E"

        else -> "F" // ! Default case
    }
    println("Grade: $grade")
}