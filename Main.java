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
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
