package blackjack.strategy.draw;

import blackjack.domain.card.Cards;
import blackjack.domain.player.Participant;

public class DealerDrawStrategy {

    private Cards cards;
    private final int DRAWABLE_SCORE = 16; // 16이하면 무조건 뽑는다.
    public DealerDrawStrategy(Cards cards) {
        this.cards = cards;
    }

    public boolean isDrawable() {
        return cards.sumAll() <= DRAWABLE_SCORE;
    }

}
