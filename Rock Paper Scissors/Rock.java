import java.util.Random;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        int score = 0;
        int rock = 0;
        int paper = 1;
        int scissors = 2;



        while (true) {
            System.out.println("Do you want to play ?");
            System.out.println("[1]. Yes\t [2]. No\t");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("Thank you for playing");
                System.out.println("Your score is " + score);
                break;

            } else if (answer == 1) {
                System.out.println("Let's play");

                System.out.println("Choose");
                System.out.println("[0] Rock\n [1] Paper\n [2] Scissors\n");
            }else {
                System.out.println("invalid");
            }




                int number = scanner.nextInt();

                Random random = new Random();
                int foe = random.nextInt(2);




                if(foe == number){
                    System.out.println("draw");
                }
                else if (number == 0 && foe == 1){
                    System.out.println("You loose");
                    score--;
                }
                else if (number == 0 && foe == 2){
                    System.out.println("You won");
                    score++;
                }
                else if (number == 1 && foe == 0){
                    System.out.println("You won");
                    score++;
                }
                else if (number == 1 && foe == 2){
                    System.out.println("You lost");
                    score--;
                }
                else if (number == 2  && foe == 0){
                    System.out.println("You lost");
                    score--;
                }
                else if (number == 2 && foe == 1){
                    System.out.println("You won");
                    score++;
                }
                else {
                    System.out.println("invalid");

                }

                System.out.println("Your score " + score);


            }
        }


    }

