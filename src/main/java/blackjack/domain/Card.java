package blackjack.domain;

public class Card {
    private String pattern;
    private String cardNumber;

    public Card(String pattern, String cardNumber) {
        this.pattern = pattern;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString(){
        return cardNumber + pattern;
    }
}
