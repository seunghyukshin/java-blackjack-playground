package blackjack.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public String getName() {
        return name;
    }

    // TODO : ENUM 공통 메소드 추출
    public static List<String> getNames() {
        return Arrays.stream(values())
                .map(cardNumber -> cardNumber.name)
                .collect(Collectors.toList());
    }

    // TODO : want11 Strategy로 refactor
    public int getValue(boolean want11) {

        // J,K,Q
        if (this == JACK || this == KING || this == QUEEN) {
            return 10;
        }

        // A
        if (this == ACE) {
            return _getValueOfAce(want11);
        }

        // 숫자
        return Integer.parseInt(this.name);
    }

    private int _getValueOfAce(boolean want11) {
        if (want11) {
            return 11;
        } else {
            return 1;
        }
    }
    
    public boolean isAce() {
        return this == ACE;
    }

}
