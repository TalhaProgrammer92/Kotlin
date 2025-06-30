// ? Class - Score
class Score(val score: Int = 0)
{
    // * Attribute
    private var _value: Int = score

    // * Getter
    fun get(): Int
    {
        return _value
    }

    // * Method - Increase Score
    fun increase()
    {
        _value++
    }

    // * Method - Reset score
    fun reset()
    {
        _value = 0
    }
}

// ? Class - Player
class Player(val name: String = "Guest", val symbol: Char, val _score: Int = 0)
{
    val score: Score = Score(_score)
}

fun main()
{
    val obj: Player = Player("Talha Ahmad", 'T')

    obj.score.increase()
    obj.score.increase()

    val name: String = obj.name
    val symbol: Char = obj.symbol
    val score: Int = obj.score.get()

    println("$name has symbol '$symbol' and made '$score' score")
}