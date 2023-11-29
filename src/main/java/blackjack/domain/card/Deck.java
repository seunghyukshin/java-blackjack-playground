package blackjack.domain.card;

import blackjack.enums.CardNumber;
import blackjack.enums.CardPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Deck {
    // TODO : 왜 상속받지않고 필드로 갖게 되었나?
    private Cards cards;

    public Deck() {
        _init();
        cards.shuffle();
    }

    // 52장 생성
    public void _init() {
        List<Card> cardList = new ArrayList<>();
        Arrays.stream(CardPattern.values()).forEach(pattern -> Arrays.stream(CardNumber.values()).forEach(number -> cardList.add(new Card(pattern, number))));

        cards = new Cards(cardList);
    }

    public Card top() {
        return cards.pop();
    }

}
