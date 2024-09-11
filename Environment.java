public class Environment {
    private char[][] matrix;
    private static final int SIZE = 3;

    public Environment() {
        matrix = new char[SIZE][SIZE];
        initializeMatrix();
    }

    private void initializeMatrix() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = ' ';
            }
        }
    }

    public void displayMatrix() {
        // Keep the existing implementation
    }

    public boolean isCellEmpty(int row, int col) {
        return matrix[row][col] == ' ';
    }

    public void setCell(int row, int col, char value) {
        matrix[row][col] = value;
    }

    public char getCell(int row, int col) {
        return matrix[row][col];
    }

    public static int getSize() {
        return SIZE;
    }
}
