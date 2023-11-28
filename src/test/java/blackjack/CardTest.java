package blackjack;

import blackjack.domain.card.Card;
import blackjack.domain.card.Deck;
import blackjack.domain.player.Dealer;
import blackjack.domain.player.Person;
import blackjack.domain.player.Player;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CardTest {

    @Test
    public void CardTest() {

        Card card = new Card("다이아몬드", "2");
        assertThat("2다이아몬드".equals(card.toString()));

    }

    @Test
    public void UserCardTest() {
        Person dealer = new Dealer("딜러");
        Person player = new Player("Sam");

        Deck deck = new Deck();
        player.drawCard(deck, 2);
        player.showAllCard();
        player.showAllCard();
        player.showAllCard();

        dealer.drawCard(deck, 2);
        dealer.showAllCard();
        dealer.showAllCard();
        dealer.showAllCard();
        dealer.showOneCard();
        dealer.showOneCard();
        dealer.showOneCard();
    }
}
