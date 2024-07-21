
import kotlin.math.min

class Solution {

    private companion object {
        const val MIN_NEEDED_COINS_WITH_VALUE_10 = 4
        const val MIN_NEEDED_COINS_WITH_VALUE_75 = 1
        val PLAYERS = arrayOf("Bob", "Alice")
    }

    fun losingPlayer(numberOfCoinsWithValue_75: Int, numberOfCoinsWithValue_10: Int): String {
        val numberOfTurns = min((numberOfCoinsWithValue_75 / MIN_NEEDED_COINS_WITH_VALUE_75),
                                 (numberOfCoinsWithValue_10 / MIN_NEEDED_COINS_WITH_VALUE_10))
        return PLAYERS[numberOfTurns % 2]
    }
}
