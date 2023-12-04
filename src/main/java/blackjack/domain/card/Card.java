package blackjack.domain.card;

import blackjack.enums.CardNumber;
import blackjack.enums.CardPattern;

public class Card {
    private CardPattern cardPattern;
    private CardNumber cardNumber;

    public Card(String cardPattern, String cardNumber) {
        this.cardPattern = CardPattern.valueOf(cardPattern);
        this.cardNumber = CardNumber.valueOf(cardNumber);
    }

    public Card(CardPattern cardPattern, CardNumber cardNumber) {
        this.cardPattern = cardPattern;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return cardNumber.getName() + cardPattern.getName();
    }

    public int getNumber(boolean want11) {
        // TODO :
        return cardNumber.getValue(want11);
    }

    public int getNumber() {
        // TODO :
        return cardNumber.getValue(false);
    }
    public boolean isAce() {
        return cardNumber.isAce();
    }
}
