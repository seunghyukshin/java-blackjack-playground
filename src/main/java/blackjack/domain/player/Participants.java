package blackjack.domain.player;

import blackjack.view.InputView;
import blackjack.view.ResultView;

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

    public void dealCard(int count) {
        participants.forEach(participant -> participant.drawCard(count));
    }

    // 테스트 출력용 메소드
    public void test() {
        participants.forEach(System.out::println);
    }

    public void play() {
        participants.forEach(participant -> participant.playTurn());
    }

    public void score() {
        participants.forEach(participant -> participant.printScore());
    }

    public void settle() {
        List<Player> players = _getOnlyPlayers();
        Dealer dealer = _getDealer();

        players.forEach(player -> player.match(dealer)); // profit settle

        ResultView.printTitleOfSettlement();
        participants.forEach(Participant::printSettlement);
    }

    private Dealer _getDealer() {

        return participants.stream()
                .filter(participant -> participant instanceof Dealer)
                .map(participant -> (Dealer) participant)
                .findFirst()
                .get();
    }
}
