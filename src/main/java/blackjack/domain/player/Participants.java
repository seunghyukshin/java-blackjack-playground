package blackjack.domain.player;

import blackjack.domain.card.Deck;

import java.util.List;

public class Participants {
    private final List<Participant> participants;

    public Participants(List<Participant> participants) {
        this.participants = participants;
    }

    public void showFirstCard() {
        this.participants.forEach(Participant::showFirstCards);
    }

    public void dealCard(Deck deck, int count) {
        this.participants.forEach(participant -> participant.drawCard(deck, 2));
    }
}
