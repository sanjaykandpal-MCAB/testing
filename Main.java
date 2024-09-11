import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try {
            System.out.println("Player Loading...");
            Thread.sleep(4000); // delay 4 seconds
            Player p1 = new Player(); // Player creation
            Player p2 = new Player();

            System.out.println("Players created... ");
            System.out.println("Choose player 1 what you want to choose ? X: O");
            Scanner sc = new Scanner(System.in);
            char p1Choice = sc.next().charAt(0);
            p1.choice(p1Choice);

            char p2Choice = p1Choice == 'X' ? '0' : 'X';
            System.out.println("Player 2 choice is : " + p2Choice);
            p2.choice(p2Choice);

            int i = 0;
            do{
                System.out.println("Choose position for player 1");
                System.out.println("Enter row for Player 1");
                int row  = sc.nextInt();
                System.out.println("Enter column for Player 1");
                int col = sc.nextInt();
                callMove(row, col);

                // Check if player 1 win
                if(p1.check()){
                    System.out.println("Player 1 win");
                    return;
                }

                System.out.println("Choose position for player 2");
                System.out.println("Enter row for Player 2");
                int row2 = sc.nextInt();
                System.out.println("Enter column for Player 2");
                int col2 = sc.nextInt();
                callMove(row2, col2);

                // Check if player 2 win
                if(p2.check()){
                    System.out.println("Player 2 win");
                    return;
                }   
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Error occurred: ");
            e.printStackTrace();

        } catch (Exception e){
            System.out.println("Error occurred: ");
            e.printStackTrace();
        }   
    }
}
