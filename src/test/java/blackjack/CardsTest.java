package blackjack;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;
import blackjack.enums.CardNumber;
import blackjack.enums.CardPattern;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CardsTest {
    Cards cards;
    @BeforeEach
    public void initCards(){
        List<Card> list = new ArrayList<>();
        list.add(new Card(CardPattern.CLOVER, CardNumber.TWO));
        list.add(new Card(CardPattern.SPADE, CardNumber.TEN));
        cards = new Cards(list);
    }
    @Test
    public void show(){
        System.out.println(cards);
    }
    @Test
    public void sum(){
        int sum = cards.sumAll();
        assertThat(sum).isEqualTo(12);
        System.out.println(sum);
    }
}
