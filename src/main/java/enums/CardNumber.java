package enums;

public enum CardNumber {

    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    KING("K"),
    QUEEN("Q");


    public String name;

    CardNumber(String name) {
        this.name = name;
    }

    // TODO : want11 Strategy로 refactor
    private int getValue(CardNumber cardNumber, boolean want11) {

        // J,K,Q
        if (cardNumber == JACK || cardNumber == KING || cardNumber == QUEEN) {
            return 10;
        }

        // A
        if (cardNumber == ACE) {
            return _getValueOfAce(want11);
        }

        // 숫자
        return Integer.parseInt(cardNumber.name);
    }

    private int _getValueOfAce(boolean want11) {
        if (want11) {
            return 11;
        } else {
            return 1;
        }
    }

}
