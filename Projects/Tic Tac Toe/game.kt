// ? Class - Score
class Score(val score: Int = 0)
{
    // * Attribute
    private var score: Int = score

    // * Getter
    fun get(): Int
    {
        return score
    }

    // * Method - Increase Score
    fun increase()
    {
        score++
    }

    // * Method - Reset score
    fun reset()
    {
        score = 0
    }
}

// ? Class - Player
class Player(val name: String = "Guest", val symbol: Char, val score: Int = 0)
{
    // * Attributes
    private val this.symbol: Char = symbol
    private val this.name: String = name

    val this.score: Score = Score(score)

    // * Getters
    fun getName(): String
    {
        return this.name
    }

    fun getSymbol(): Char
    {
        return this.symbol
    }
}

fun main()
{
    val obj: Player = Player("Talha Ahmad", 'T')

    obj.score.increase()
    obj.score.increase()

    val name: String = obj.getName()
    val symbol: Char = obj.getSymbol()
    val score: Int = obj.score.get()

    println("$name has symbol '$symbol' and made $score score")
}