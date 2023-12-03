package blackjack.domain.player;

import blackjack.strategy.draw.DealerDrawStrategy;
import blackjack.view.ResultView;


public class Dealer extends Participant {
    public Dealer(String name) {
        super(name);
    }

    public Dealer() {
        super("딜러");
    }

    @Override
    public void showFirstCards() {
        _showOneCard();
    }

    @Override
    public void playTurn() {
        DealerDrawStrategy drawStrategy = new DealerDrawStrategy(hands);

        if(drawStrategy.isDrawable()){
            ResultView.printDrawResultOfDealer();
            drawCard(1);

            return;
        }

        ResultView.printNoDrawOfDealer();
    }

    private void _showOneCard() {
        // TODO: dealer 보여줄 카드 : 무작위?
        ResultView.printCardContent(name, hands.peek().toString());
    }
}
