package blackjack.strategy;

public class GameEndStrategy {

    private int score;
    private final int BLACKJACK_SCORE = 21;

    public GameEndStrategy(int score) {
        this.score = score;
    }

    public boolean isBlackjack() {
        return score == BLACKJACK_SCORE;
    }

    public boolean isBurst() {
        return score > BLACKJACK_SCORE;
    }
}
