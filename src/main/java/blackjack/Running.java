package blackjack;

public abstract class Running extends Started{
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public double profit(double profit) {
        return 0;
    }
}
