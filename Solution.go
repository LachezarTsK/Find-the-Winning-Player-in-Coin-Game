
package main

import "fmt"

const MIN_NEEDED_COINS_WITH_VALUE_10 = 4
const MIN_NEEDED_COINS_WITH_VALUE_75 = 1

var PLAYERS = [2]string{"Bob", "Alice"}

func losingPlayer(numberOfCoinsWithValue_75 int, numberOfCoinsWithValue_10 int) string {
    numberOfTurns := min((numberOfCoinsWithValue_75 / MIN_NEEDED_COINS_WITH_VALUE_75),
                         (numberOfCoinsWithValue_10 / MIN_NEEDED_COINS_WITH_VALUE_10))
    return PLAYERS[numberOfTurns%2]
}
