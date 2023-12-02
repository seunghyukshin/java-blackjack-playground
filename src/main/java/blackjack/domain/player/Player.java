package blackjack.domain.player;

public class Player extends Participant {
    private int betAmount;

    public Player(String name) {
        super(name);
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    @Override
    public void showFirstCards() {
        showAllCard();
    }

    @Override
    public void playTurn(){
        super.playTurn();
    }
    @Override
    public String toString() {
        return String.format("이름 : %s, 베팅금액 : %d, 카드 : %s", name, betAmount, hands.toString());
    }
}
