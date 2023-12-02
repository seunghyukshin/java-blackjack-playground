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
}
