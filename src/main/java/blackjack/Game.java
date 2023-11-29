package blackjack;

import blackjack.domain.card.Deck;
import blackjack.domain.player.Dealer;
import blackjack.domain.player.Participants;
import blackjack.domain.player.Participant;
import blackjack.domain.player.Player;
import blackjack.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Deck deck;
    private Participants participants;

    public Game(List<Player> players) {
        deck = new Deck();

        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Dealer());
        participantList.addAll(players);
        this.participants = new Participants(participantList);
    }

    /**
     * 1. 배팅
     * 2-1. 각 2장 나눠주기.
     * 2-2. 첫패 보여주기 (딜러:1, 플레이어:2)
     */
    public void play() {
        _bet();
        participants.dealCard(deck, 2);
        participants.showFirstCard();


    }


    private void _bet() {

        int bettingAmount = InputView.getBettingAmount();

    }

}
