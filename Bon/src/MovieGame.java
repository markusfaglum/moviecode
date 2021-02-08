
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MovieGame {

   static int dice1;
    static int dice2;
    static int diceWinner;

    public static void main(String[]args ) {

        Dice dice = new Dice();

        //movies m = new movies();

        player player1 = new player();

        player player2 = new player();

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("============================");
        System.out.println("Enter name");
        System.out.print("Player 1:");

        player1.setName(scan.next());  // Read user input
            System.out.println("============================");
            System.out.println("Enter name");
            System.out.print("Player 2:");



             player2.setName(scan.next());
        System.out.println("============================");
            System.out.println("Player 1: " + player1.getName() + " Player 2: " + player2.getName());// Output user inp

            System.out.println("============================");
            System.out.print("press 1 to Start:");

            scan.next();

        System.out.println("============================");
        System.out.println("roll a dice to see who goes first");
        System.out.println("Player 1 rolls first");
        System.out.print("Press any button:");

        scan.next();

        dice1 = dice.rollDice();

        System.out.println("Player 1 rolled a:" + dice1);

        System.out.println("============================");
        System.out.println("Player 2:s turn");
        System.out.print("Press any button:");

        scan.next();

        dice2 = dice.rollDice();

        System.out.println("Player 2 rolled a:" + dice2);

        if (dice1 > dice2) {
            player1.changeTurn();

        } else {
            player2.changeTurn();
        }

            if (player1.getTurn()== true){
                System.out.println("hej");
            }

        }

        //public game() {

        }



