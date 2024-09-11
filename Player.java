class Player extends Environment{
    char playerChoice;
    public void choice(char choice){
        this.playerChoice = choice;
    }
    private void move(int row,int col){

        // Enter valid row and column
        if((row < 0 || row >= 3) || (col < 0 || col >= 3)){
            System.out.println("Enter valid row and column");
            move(row, col);
        }
        matrix[row][col] = playerChoice;
    }
    public void callMove(int row,int col){
        move(row, col);
    }

    private boolean check(){
        // Needs to do
    }

}