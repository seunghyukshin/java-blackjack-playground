package blackjack.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String[] getPlayerNames() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String playerNameString = scanner.nextLine();

        return playerNameString.split(",");
    }

    public static int getBettingAmount(String playerName) {
        System.out.println();
        System.out.println(String.format("%s의 배팅금액은?", playerName));

        return Integer.parseInt(scanner.nextLine());
    }

    public static boolean isMoreDeal(String playerName) {
        System.out.println();
        System.out.println(String.format("%s는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)", playerName));

        return "y".equals(scanner.nextLine());
    }

}
