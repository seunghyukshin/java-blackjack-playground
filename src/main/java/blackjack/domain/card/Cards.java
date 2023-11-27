package blackjack.domain.card;


import java.util.List;

public class Cards {

    // 일급컬렉션 미사용
    private List<Card> cards;

    public Cards(List<Card> cardList) {
        this.cards = cardList;
    }
}
