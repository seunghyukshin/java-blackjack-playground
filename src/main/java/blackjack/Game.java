package blackjack;

import blackjack.domain.card.Deck;
import blackjack.domain.player.Dealer;
import blackjack.domain.player.Person;
import blackjack.domain.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Deck deck;
    private List<Person> gamers = new ArrayList<>();

    public Game(List<Player> players) {
        deck = new Deck();

        gamers.add(new Dealer());
        gamers.addAll(players);
        System.out.println(gamers.toString());
    }

    /**
     * 1. 각 2장 나눠주기.
     */
    public void play() {
        _dealTwoCard();
        this.gamers.forEach(Person::showFirstCards);
    }


    // 1,. 2장씩돌리기
    private void _dealTwoCard() {
        this.gamers.forEach(p -> p.drawCard(deck, 2));
    }
}
