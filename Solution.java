
public class Solution {

    private static final int MIN_NEEDED_COINS_WITH_VALUE_10 = 4;
    private static final int MIN_NEEDED_COINS_WITH_VALUE_75 = 1;
    private static final String[] PLAYERS = {"Bob", "Alice"};

    public String losingPlayer(int numberOfCoinsWithValue_75, int numberOfCoinsWithValue_10) {
        int numberOfTurns = Math.min((numberOfCoinsWithValue_75 / MIN_NEEDED_COINS_WITH_VALUE_75),
                                     (numberOfCoinsWithValue_10 / MIN_NEEDED_COINS_WITH_VALUE_10));
        return PLAYERS[numberOfTurns % 2];
    }
}
