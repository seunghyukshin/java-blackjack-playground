package blackjack.domain.player;

import blackjack.domain.card.Cards;

public abstract class Player {
    private String name;
    Cards handCards;

    public abstract void displayAllCards();
}
