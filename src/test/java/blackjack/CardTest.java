package blackjack;

import blackjack.domain.card.Card;
import blackjack.domain.card.Deck;
import blackjack.domain.player.Dealer;
import blackjack.domain.player.Participant;
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
        Participant dealer = new Dealer("딜러");
        Participant player = new Player("Sam");

        Deck deck = new Deck();
        player.drawCard(deck, 2);
        player.showAllCard();
        player.showAllCard();
        player.showFirstCards();

        dealer.drawCard(deck, 2);
        dealer.showAllCard();
        dealer.showAllCard();
        dealer.showAllCard();
        dealer.showFirstCards();
        dealer.showFirstCards();
        dealer.showFirstCards();
    }
}
