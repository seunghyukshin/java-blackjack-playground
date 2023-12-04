package blackjack.domain.card;


import blackjack.strategy.GameEndStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {

    // 일급컬렉션 미사용
    private List<Card> cards;

    public Cards() {
        this.cards = new ArrayList<>();
    }

    public Cards(List<Card> cardList) {
        this.cards = cardList;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card pop() {
        // TODO : size 0일때, 예외처리
        return cards.remove(0);
    }

    public Card peek() {
        // TODO : size 0일때, 예외처리
        return cards.get(0);
    }

    public int size() {
        return cards.size();
    }

    public void add(Card card) {
        cards.add(card);
    }

    @Override
    public String toString() {
        return cards.stream().map(Card::toString).collect(Collectors.joining(", "));
    }

    public int sumAll() {
        int sum = _sum(false);

        if (_containsAce()) {
            return _sumMaxForAce(sum);
        }

        return sum;
    }

    // 11 대입 후 Burst면 Ace:1 로 취급
    private int _sumMaxForAce(int sumAllAs1) {
        int sumAllAs11 = _sum(true);
        if (GameEndStrategy.isNotBurst(sumAllAs11)) {
            return sumAllAs11;
        }
        return sumAllAs1;
    }

    private int _sum(boolean want11) {
        return cards.stream().map(card -> card.getNumber(want11)).reduce((a, b) -> a + b).get();
    }

    private boolean _containsAce() {
        return cards.stream().anyMatch(Card::isAce);
    }
}
