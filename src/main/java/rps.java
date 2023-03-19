import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            String[] rps = {"rock", "paper", "scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];


            String playerMove;

            while (true) {
                System.out.println("");
                System.out.println("Let's see if you can beat the computer in Rock Paper Scissors." +
                        " Please enter your move (rock, paper, or scissors)");
                playerMove = scanner.nextLine();

                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Tie Game!!");
            }
            else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("");
                    System.out.println("Sorry loser!! Computer won");
                } else if (computerMove.equals("scissors")) {
                    System.out.println(" ");
                    System.out.println("You beat the computer!");
                }

            } else if (playerMove.equals("paper")) {
                if (computerMove.equals("scissors")) {
                    System.out.println("");
                    System.out.println("Sorry loser!! Computer won");
                } else if (computerMove.equals("rock")) {
                    System.out.println("");
                    System.out.println("You beat the computer!");
                }
            } else if (playerMove.equals("scissors")) {
                if (computerMove.equals("rock")) {
                    System.out.println("");
                    System.out.println("Sorry loser!! Computer won");
                } else if (computerMove.equals("paper")) {
                    System.out.println("");
                    System.out.println("You beat the computer!");
                }
            }
            System.out.println("Do you want to play again? (y/n)");
            String playAnother = scanner.nextLine();

            if(!playAnother.equals("y")){
                break;
            }
        }


    }
}


