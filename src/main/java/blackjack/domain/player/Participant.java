package blackjack.domain.player;

import blackjack.domain.card.Cards;
import blackjack.strategy.draw.DealerDrawStrategy;
import blackjack.strategy.GameEndStrategy;
import blackjack.view.InputView;
import blackjack.view.ResultView;

import static blackjack.Game.deck;

public abstract class Participant {
    protected String name;
    protected Cards hands;

    public Participant(String name) {
        this.name = name;
        this.hands = new Cards();
    }

    @Override
    public String toString() {
        return String.format("이름 : %s, 카드 : %s", name, hands.toString());
    }

    // 장수 만큼 뽑기
    public void drawCard(int count) {
        for (int i = 0; i < count; i++) {
            hands.add(deck.top());
        }
    }

    public abstract void showFirstCards();

    public void showAllCard() {
        ResultView.printCardContent(name, hands.toString());
    }

    /**
     * 1. 2장받은 카드가 블랙잭인지 확인
     * 2. 더 받을지 여부 확인
     */
    public abstract void playTurn();

    public void score() {
        ResultView.printScore(name, hands.toString(), hands.sumAll());
    }
}
