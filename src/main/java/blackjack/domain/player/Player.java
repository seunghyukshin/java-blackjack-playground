package blackjack.domain.player;

import blackjack.strategy.GameEndStrategy;
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

    /**
     * 1. 딜러가 21을 초과하면 그 시점까지 남아 있던 플레이어들은 가지고 있는 패에 상관 없이 승리해 베팅 금액을 받는다.
     * 2. 플레이어가 21을 초과할 경우 배팅 금액을 모두 잃게 된다.
     * 3. 처음 두 장의 카드 합이 21일 경우 블랙잭이 되면 베팅 금액의 1.5 배를 딜러에게 받는다.
     * 3-2. 딜러와 플레이어가 모두 동시에 블랙잭인 경우 플레이어는 베팅한 금액을 돌려받는다.
     */
    public void match(Dealer dealer) {
        GameEndStrategy dealerStrategy = new GameEndStrategy(dealer.hands);
        GameEndStrategy playerStrategy = new GameEndStrategy(this.hands);

        // 1. 플레이어 승
        if (dealerStrategy.isBurst() && playerStrategy.isNotBurst()) {
            this.addProfit(betAmount);
            dealer.subtractProfit(betAmount);
        }

        // 2. 딜러 승
        if (playerStrategy.isBurst() && dealerStrategy.isNotBurst()) {
            dealer.addProfit(betAmount);
            this.subtractProfit(betAmount);
        }

        // 3. 플레이어 블랙잭 승
        if (playerStrategy.isBlackjack() && dealerStrategy.isNotBlackjack()) {
            this.addProfit(betAmount * 1.5);
            dealer.subtractProfit(betAmount * 1.5);
        }

        // 4. 판정승
        if (playerStrategy.isNotBurst() && dealerStrategy.isNotBurst()) {
            _compareScore(dealer);
        }

        // 5. 원금회수 = 둘 다 Burst 혹은 두사람 점수 같은 경우

    }

    // 점수 더 큰 참가자 반환
    private void _compareScore(Dealer dealer) {

        if (this.hands.sumAll() > dealer.hands.sumAll()) {
            this.addProfit(betAmount);
            dealer.subtractProfit(betAmount);
        }
        if (this.hands.sumAll() < dealer.hands.sumAll()) {
            dealer.addProfit(betAmount);
            this.subtractProfit(betAmount);
        }
    }
}
