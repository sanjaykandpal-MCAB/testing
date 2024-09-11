public class Environment {
    protected static char[][] matrix;
    protected static final int SIZE = 3;

    public Environment() {
        matrix = new char[SIZE][SIZE];
        // Initialize the matrix with empty spaces
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = ' ';
            }
        }
    }

    // Display the current state of the matrix
    public void displayMatrix() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j]);
                if (j < SIZE - 1) System.out.print("|");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("-+-+-");
        }
    }

    // Check if a cell is empty
    protected boolean isCellEmpty(int row, int col) {
        return matrix[row][col] == ' ';
    }
}
