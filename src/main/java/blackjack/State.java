package blackjack;

public interface State {
    public State draw(PlayingCard playingCard);
    public State stay();
    public boolean isFinished();
    public Cards cards();
    public double profit(double profit);
}
