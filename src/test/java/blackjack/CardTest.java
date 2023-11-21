package blackjack;

import blackjack.domain.card.Card;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CardTest {

    @Test
    public void CardTest(){

        Card card = new Card("다이아몬드", "2");
        assertThat("2다이아몬드".equals(card.toString()));

    }
}
