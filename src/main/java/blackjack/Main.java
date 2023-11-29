package blackjack;

import blackjack.domain.player.Player;
import blackjack.view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        String[] playerNames = InputView.getPlayerNames();
        List<Player> players = Arrays.stream(playerNames).map(Player::new).collect(Collectors.toList());

        Game game = new Game(players);

        game.play();
    }
}
