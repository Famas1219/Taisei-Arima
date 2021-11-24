import java.util.Random;
import java.util.Scanner;

public class Java {
    public static void main(String[] args) {

        int score = 0;

        //Random random = new Random(2);
        while (true) {
            String[] rps = {"Rock", "Paper", "Scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            Scanner scanner = new Scanner(System.in);
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (Rock,Paper, or Scissors)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                    break;
                }
                    System.out.println(playerMove + " is not a valid move");

            }

            if (playerMove.equals(computerMove)) {
                System.out.println("draw");
            } else if (playerMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("you lose");
                    score--;
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("you win");
                    score++;

                }

            } else if (playerMove.equals("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("you win");
                    score++;
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("you lose");
                    score--;

                }
            }
            System.out.println("Play again (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {

                break;

            }
            System.out.println("your score is " + score);
        }
    }
}

