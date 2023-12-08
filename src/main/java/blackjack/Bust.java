package blackjack;

public class Bust extends Finished{
    @Override
    public double earningRate() {
        return 1;
    }
}
