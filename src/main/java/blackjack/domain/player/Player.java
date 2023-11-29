package blackjack.domain.player;

public class Player extends Person {
    private int betAmount;

    public Player(String name) {
        super(name);
    }

    @Override
    public void showFirstCards() {
        showAllCard();
    }
}
