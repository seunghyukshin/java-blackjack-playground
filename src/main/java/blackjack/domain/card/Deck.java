package blackjack.domain.card;

import enums.CardNumberEnum;
import enums.CardPatternEnum;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> deck; // TODO:Cards
    public Deck() {
        _init();
    }

    // 52장 생성
    private void _init() {
        // TODO : 여기에 담아야함
        List<Card> cardList = new ArrayList<>();
        
        List<String> cardPatternList = CardPatternEnum.getNames();
        List<String> cardNumberList = CardNumberEnum.getNames();
    }
}
