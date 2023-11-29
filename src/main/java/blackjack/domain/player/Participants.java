package blackjack.domain.player;

import blackjack.domain.card.Deck;
import blackjack.view.InputView;

import java.util.List;
import java.util.stream.Collectors;

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

    public void bet() {
        _getOnlyPlayers().stream().forEach(player -> player.setBetAmount(InputView.getBettingAmount(player.name)));
    }

    private List<Player> _getOnlyPlayers() {
        return participants.stream()
                .filter(participant -> participant instanceof Player)
                .map(participant -> (Player) participant)
                .collect(Collectors.toList());
    }
}
