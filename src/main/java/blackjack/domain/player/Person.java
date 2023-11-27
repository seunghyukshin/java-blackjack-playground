package blackjack.domain.player;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;

import java.util.List;

public abstract class Person {
    private String name;
    Cards handCards;

    public void displayAllCards() {
        System.out.println();
    }
}
