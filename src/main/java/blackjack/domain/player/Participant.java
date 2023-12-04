package blackjack.domain.player;

import blackjack.domain.card.Cards;
import blackjack.view.ResultView;

import static blackjack.Game.deck;

public abstract class Participant {
    // TODO : 변수 3개로
    protected String name;
    protected Cards hands;
    protected int profit; // 수익

    public Participant(String name) {
        this.name = name;
        this.hands = new Cards();
    }

    public void giveProfit(Participant participant, int profit){
        participant.addProfit(profit);
        this.subtractProfit(profit);
    }

    public void addProfit(int profit) {
        this.profit += profit;
    }

    public void subtractProfit(int profit) {
        this.profit -= profit;
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

    public void printScore() {
        ResultView.printScore(name, hands.toString(), hands.sumAll());
    }

    public void printSettlement() {
        ResultView.printSettlement(name, profit);
    }
}
