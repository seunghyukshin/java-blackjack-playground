package blackjack.domain.card;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public void add(Card card) {
        cards.add(card);
    }

    @Override
    public String toString() {
        return cards.stream().map(Card::toString).collect(Collectors.joining(", "));
    }

}
