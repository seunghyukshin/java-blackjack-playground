package blackjack.domain.card;

import blackjack.enums.CardNumberEnum;
import blackjack.enums.CardPatternEnum;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    // TODO : 왜 상속받지않고 필드로 갖게 되었나?
    private Cards cards;

    public Deck() {
        _init();
        cards.shuffle();
    }

    // 52장 생성
    public void _init() {
        // TODO : 여기에 담아야함
        List<Card> cardList = new ArrayList<>();

        List<String> cardPatternList = CardPatternEnum.getNames();
        List<String> cardNumberList = CardNumberEnum.getNames();

        cardPatternList.forEach(cardPattern -> cardNumberList.stream().forEach(cardNumber -> cardList.add(new Card(cardPattern, cardNumber))));

        cards = new Cards(cardList);
    }

    public Card top() {
        return cards.pop();
    }

}
