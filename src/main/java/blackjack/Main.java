package blackjack;

import blackjack.domain.player.Player;
import blackjack.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String playerNames = InputView.getPlayerNames();
        String[] split = playerNames.split(",");
        for(String s : split){
            new Player(s);
        }

        List<Player> players = new ArrayList<>();
        Game game = new Game(players);

        game.play();
    }
}
