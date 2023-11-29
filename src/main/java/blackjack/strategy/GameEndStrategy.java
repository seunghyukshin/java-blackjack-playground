package blackjack.strategy;

public class GameEndStrategy {

    private final int BLACKJACK_SCORE = 21;
    public boolean isBlackjack(int score){
        return score == BLACKJACK_SCORE;
    }

    public boolean isBurst(int score){
        return score > BLACKJACK_SCORE;
    }
}
