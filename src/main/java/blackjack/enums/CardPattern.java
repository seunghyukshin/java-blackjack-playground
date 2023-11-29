package blackjack.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum CardPattern {

    HEART("하트"),
    SPADE("스페이드"),
    CLOVER("클로버"),
    DIAMOND("다이아몬드");


    public String name;

    CardPattern(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // TODO : ENUM 공통 메소드 추출
    public static List<String> getNames(){
        return Arrays.stream(values())
                .map(cardPattern -> cardPattern.name)
                .collect(Collectors.toList());
    }
}
