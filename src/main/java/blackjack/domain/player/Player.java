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
}
