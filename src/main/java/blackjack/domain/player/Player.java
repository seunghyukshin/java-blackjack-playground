package blackjack.domain.player;

public class Player extends Participant {
    private int betAmount;

    public Player(String name) {
        super(name);
    }

    @Override
    public void showFirstCards() {
        showAllCard();
    }
}
