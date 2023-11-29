package blackjack.domain.player;

import blackjack.domain.card.Card;

public class Dealer extends Participant {
    public Dealer(String name) {
        super(name);
    }

    public Dealer() {
        super("딜러");
    }
    @Override
    public void showFirstCards() {
        _showOneCard();
    }

    private void _showOneCard() {
        // TODO: dealer 보여줄 카드 : 무작위?
        Card card = this.hands.peek();
        _showCard(card.toString());
    }
}
