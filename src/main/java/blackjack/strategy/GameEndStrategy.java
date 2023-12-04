package blackjack.strategy;

import blackjack.domain.card.Cards;

public class GameEndStrategy {

    private Cards cards;
    private static final int BLACKJACK_SCORE = 21;

    public GameEndStrategy(Cards cards) {
        this.cards = cards;
    }

    public boolean isBlackjack() {
        return cards.sumAll() == BLACKJACK_SCORE && cards.size() == 2;
    }

    public boolean isNotBlackjack() {
        return !isBlackjack();
    }

    public boolean isBurst() {
        return cards.sumAll() > BLACKJACK_SCORE;
    }


    public static boolean isBurst(int sumAll) {
        return sumAll > BLACKJACK_SCORE;
    }
    public static boolean isNotBurst(int sumAll) {
        return !isBurst(sumAll);
    }

    public boolean isNotBurst() {
        return !isBurst();
    }
}
