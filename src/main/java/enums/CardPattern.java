package enums;

public enum CardPattern {

    HEART("하트"),
    SPADE("스페이드"),
    CLOVER("클로버"),
    DIAMOND("다이아몬드");


    public String name;

    CardPattern(String name) {
        this.name = name;
    }


}
