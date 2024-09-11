public interface IPlayer {
    void makeMove(Environment env);
    char getPlayerChoice();
    boolean checkWin(Environment env);
}
