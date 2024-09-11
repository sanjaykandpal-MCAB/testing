import java.util.*;
public class Player implements IPlayer {
    private char playerChoice;
    private Scanner scanner;

    public Player(char choice) {
        this.playerChoice = choice;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void makeMove(Environment env) {
        int row, col;
        do {
            System.out.println("Enter row (0-2) for Player " + playerChoice + ":");
            row = scanner.nextInt();
            System.out.println("Enter column (0-2) for Player " + playerChoice + ":");
            col = scanner.nextInt();
        } while (!isValidMove(env, row, col));
        
        env.setCell(row, col, playerChoice);
    }

    private boolean isValidMove(Environment env, int row, int col) {
        if (row < 0 || row >= Environment.getSize() || col < 0 || col >= Environment.getSize()) {
            System.out.println("Invalid move. Try again.");
            return false;
        }
        if (!env.isCellEmpty(row, col)) {
            System.out.println("Cell already occupied. Try again.");
            return false;
        }
        return true;
    }

    @Override
    public char getPlayerChoice() {
        return playerChoice;
    }

    @Override
    public boolean checkWin(Environment env) {
        // Check rows, columns, and diagonals
        return checkRows(env) || checkColumns(env) || checkDiagonals(env);
    }

    private boolean checkRows(Environment env) {
        for (int i = 0; i < Environment.getSize(); i++) {
            if (env.getCell(i, 0) == playerChoice &&
                env.getCell(i, 1) == playerChoice &&
                env.getCell(i, 2) == playerChoice) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns(Environment env) {
        for (int i = 0; i < Environment.getSize(); i++) {
            if (env.getCell(0, i) == playerChoice &&
                env.getCell(1, i) == playerChoice &&
                env.getCell(2, i) == playerChoice) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals(Environment env) {
        return (env.getCell(0, 0) == playerChoice &&
                env.getCell(1, 1) == playerChoice &&
                env.getCell(2, 2) == playerChoice) ||
               (env.getCell(0, 2) == playerChoice &&
                env.getCell(1, 1) == playerChoice &&
                env.getCell(2, 0) == playerChoice);
    }
}