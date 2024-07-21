
function losingPlayer(numberOfCoinsWithValue_75: number, numberOfCoinsWithValue_10: number): string {
    const MIN_NEEDED_COINS_WITH_VALUE_10 = 4;
    const MIN_NEEDED_COINS_WITH_VALUE_75 = 1;
    const PLAYERS = ["Bob", "Alice"];

    const numberOfTurns = Math.min(Math.floor((numberOfCoinsWithValue_75 / MIN_NEEDED_COINS_WITH_VALUE_75)),
                                   Math.floor((numberOfCoinsWithValue_10 / MIN_NEEDED_COINS_WITH_VALUE_10)));
    return PLAYERS[numberOfTurns % 2];
};
