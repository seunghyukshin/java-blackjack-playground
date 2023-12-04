package blackjack.view;

public class ResultView {

    public static void printCardContent(String name, String cardString) {
        System.out.println(_getCardContent(name, cardString));
    }

    private static String _getCardContent(String name, String cardString) {
        return name + " 카드: " + cardString;
    }

    public static void printScore(String name, String cardString, int score) {
        System.out.println(_getCardContent(name, cardString).concat(_getScoreContent(score)));
    }

    private static String _getScoreContent(int score) {
        return " - 결과: " + score;
    }

    public static void printDrawResultOfDealer() {
        System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
    }

    public static void printNoDrawOfDealer() {
        System.out.println("딜러는 17이상이라 카드를 더 이상 받지 않습니다.");
    }

    public static void printEnter(){
        System.out.println();
    }
}
