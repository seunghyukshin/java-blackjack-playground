package blackjack.domain.player;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;
import blackjack.domain.card.Deck;

public abstract class Person {
    protected String name;
    protected Cards hands;

    public Person(String name) {
        this.name = name;
        this.hands = new Cards();
    }

    // 장수 만큼 뽑기
    public void drawCard(Deck deck, int count) {
        // TODO : deck을 param으로 받고 싶지 않다.
        for (int i = 0; i < count; i++) {
            this.hands.add(deck.top());
        }
    }

    public abstract void showFirstCards();

    public void showAllCard() {
        _showCard(this.hands.toString());
    }

    protected void _showCard(String cardString) {
        System.out.println(this.name + " 카드: " + cardString);
    }
}
