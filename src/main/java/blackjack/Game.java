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
    public static Deck deck;
    private Participants participants;

    public Game(List<Player> players) {
        deck = new Deck();

        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Dealer());
        participantList.addAll(players);
        this.participants = new Participants(participantList);
    }

    /**
     * <p>
     * 1. 배팅
     * 2-1. 각 2장 나눠주기.
     * 2-2. 첫패 보여주기 (딜러:1, 플레이어:2)
     * 3. 각 참가자들 턴 진행
     * 3-1. 2장받은 카드가 블랙잭인지 확인
     * 3-2. 더 받을지 여부 확인
     * </p>
     */
    public void play() {
        participants.bet();
        participants.dealCard(2);
        participants.showFirstCard();

//        participants.test();

        participants.play();
    }


}
