package blackjack.domain.card;

public class Card {
    private final String pattern;
    private final String cardNumber;

    public Card(String pattern, String cardNumber) {
        this.pattern = pattern;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString(){
        return cardNumber + pattern;
    }
}
