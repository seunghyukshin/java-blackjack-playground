package blackjack.domain.card;

import enums.CardNumberEnum;
import enums.CardPatternEnum;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private Cards deck;

    public Deck() {
        _init();
    }

    // 52장 생성
    private void _init() {
        // TODO : 여기에 담아야함
        List<Card> cardList = new ArrayList<>();

        List<String> cardPatternList = CardPatternEnum.getNames();
        List<String> cardNumberList = CardNumberEnum.getNames();

        cardPatternList.stream().forEach(cardPattern -> cardNumberList.stream().forEach(cardNumber -> cardList.add(new Card(cardPattern, cardNumber))));

        deck = new Cards(cardList);
    }
}
