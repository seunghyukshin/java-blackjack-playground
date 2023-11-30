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

    public void bet() {
        for (Player player : _getOnlyPlayers()) {
            player.setBetAmount(InputView.getBettingAmount(player.name));
        }
    }

    private List<Player> _getOnlyPlayers() {
        return participants.stream()
                .filter(participant -> participant instanceof Player)
                .map(participant -> (Player) participant)
                .collect(Collectors.toList());
    }

    public void showFirstCard() {
        participants.forEach(Participant::showFirstCards);
    }

    public void dealCard(Deck deck, int count) {
        participants.forEach(participant -> participant.drawCard(deck, count));
    }

    // 테스트 출력용 메소드
    public void test() {
        participants.forEach(System.out::println);
    }

    public void play() {
        participants.forEach(participant -> participant.playTurn());
    }
}
