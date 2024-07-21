
#include <array>
#include <algorithm>
using namespace std;

class Solution {

    static const int MIN_NEEDED_COINS_WITH_VALUE_10 = 4;
    static const int MIN_NEEDED_COINS_WITH_VALUE_75 = 1;
    inline static const array<string, 2> PLAYERS = { "Bob", "Alice" };

public:
    string losingPlayer(int numberOfCoinsWithValue_75, int numberOfCoinsWithValue_10) const {
        int numberOfTurns = min((numberOfCoinsWithValue_75 / MIN_NEEDED_COINS_WITH_VALUE_75),
                                (numberOfCoinsWithValue_10 / MIN_NEEDED_COINS_WITH_VALUE_10));
        return PLAYERS[numberOfTurns % 2];
    }
};
