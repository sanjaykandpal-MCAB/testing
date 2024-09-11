public class Main {
    public static void main(String[] args) {
        Environment env = new Environment();
        IPlayer p1 = new Player('X');
        IPlayer p2 = new Player('O');
        
        System.out.println("Tic Tac Toe Game Started!");
        env.displayMatrix();

        IPlayer currentPlayer = p1;
        int moves = 0;

        while (moves < 9) {
            currentPlayer.makeMove(env);
            env.displayMatrix();

            if (currentPlayer.checkWin(env)) {
                System.out.println("Player " + currentPlayer.getPlayerChoice() + " wins!");
                return;
            }

            currentPlayer = (currentPlayer == p1) ? p2 : p1;
            moves++;
        }

        System.out.println("It's a draw!");
    }
}
