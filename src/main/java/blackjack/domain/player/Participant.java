package blackjack.domain.player;

import blackjack.domain.card.Cards;
import blackjack.domain.card.Deck;
import blackjack.view.ResultView;

public abstract class Participant {
    protected String name;
    protected Cards hands;

    public Participant(String name) {
        this.name = name;
        this.hands = new Cards();
    }

    // 장수 만큼 뽑기
    public void drawCard(Deck deck, int count) {
        // TODO : deck을 param으로 받고 싶지 않다.
        for (int i = 0; i < count; i++) {
            hands.add(deck.top());
        }
    }

    public abstract void showFirstCards();

    public void showAllCard() {
        ResultView.showCard(name, hands.toString());
    }
    @Override
    public String toString() {
        return String.format("이름 : %s, 카드 : %s", name, hands.toString());
    }
}
