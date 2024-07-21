
using System;

public class Solution
{
    private static readonly int MIN_NEEDED_COINS_WITH_VALUE_10 = 4;
    private static readonly int MIN_NEEDED_COINS_WITH_VALUE_75 = 1;
    private static readonly string[] PLAYERS = { "Bob", "Alice" };

    public string LosingPlayer(int numberOfCoinsWithValue_75, int numberOfCoinsWithValue_10)
    {
        int numberOfTurns = Math.Min((numberOfCoinsWithValue_75 / MIN_NEEDED_COINS_WITH_VALUE_75),
                                     (numberOfCoinsWithValue_10 / MIN_NEEDED_COINS_WITH_VALUE_10));
        return PLAYERS[numberOfTurns % 2];
    }
}
