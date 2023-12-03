package blackjack.strategy.draw;

import blackjack.domain.card.Cards;

public class PlayerDrawStrategy {

    private Cards cards;
    private final int DRAWABLE_SCORE = 21; // 21보다 작으면 뽑을수 있다.
    public PlayerDrawStrategy(Cards cards) {
        this.cards = cards;
    }

    public boolean isDrawable() {
        return cards.sumAll() < DRAWABLE_SCORE;
    }

}
