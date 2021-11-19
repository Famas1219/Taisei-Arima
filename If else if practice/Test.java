import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, What is your name?");
        String name = scanner.nextLine();
        System.out.println("Thank you " + name);

        System.out.println("What is the result of 2+4*7");
        System.out.println("[1]. 30\n[2]. 42\n[3]. 56");

        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("That's correct");
            score++;
        }
        else {
            System.out.println("incorrect");
            }

        System.out.println("What is the capital of Canada");
        System.out.println("[1]. Ottawa\n[2]. Vancouver\n[3]. Toronto");

        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("That's correct");
            score++;
        }
        else {
            System.out.println("incorrect");
        }

        System.out.println("Can you you store the value 'dog' in a variable of type int?" );
        System.out.println("[1]. yes\n [2]. no");


        int b = scanner.nextInt();
        if (b == 2) {
           System.out.println("That's correct");
           score++;

        }
        else {
            System.out.println("incorrect");

        }


            System.out.println(" Overall, you got "+ score + " out of 3 correct. Thanks for playing!");






        }
    }



