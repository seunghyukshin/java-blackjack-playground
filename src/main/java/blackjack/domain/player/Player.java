package blackjack.domain.player;

import blackjack.strategy.draw.DealerDrawStrategy;
import blackjack.strategy.draw.PlayerDrawStrategy;
import blackjack.view.InputView;

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
    public void playTurn() {
        PlayerDrawStrategy drawStrategy = new PlayerDrawStrategy(hands);

        while (_isHit(drawStrategy)) {
            drawCard(1);

            showAllCard();
        }
    }

    private boolean _isHit(PlayerDrawStrategy drawStrategy) {
        return drawStrategy.isDrawable() && InputView.isMoreDeal(name);
    }

    @Override
    public String toString() {
        return String.format("이름 : %s, 베팅금액 : %d, 카드 : %s", name, betAmount, hands.toString());
    }
}
