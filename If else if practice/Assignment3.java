import java.util.Scanner;

public class Assignment3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your current earth weight.");
        int weight = scanner.nextInt();

        System.out.println("I have information fo the following planets");
        System.out.println("[1]. Venus\t[2]. Mars\t[3]. Jupiter\n[4]. Saturn\t[5]. Uranus\t[6]. Neptune");
        double Venus = weight * 0.78;
        double Mars =  weight * 0.39;
        double Jupiter =  weight * 2.65;
        double Saturn =  weight * 1.17;
        double Uranus =  weight * 1.05;
        double Neptune =  weight * 1.23;



        System.out.println("Which planet are you visiting");
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println("Your weight would be " + Venus + " pounds on that planet.");
        }
        else if (number == 2){
            System.out.println("Your weight would be " + Mars + " pounds on that planet.");
        }
        else if (number == 3){
            System.out.println("Your weight would be " + Jupiter + " pounds on that planet.");
        }
        else if (number == 4){
            System.out.println("Your weight would be " + Saturn + " pounds on that planet.");
        }
        else if (number == 5){
            System.out.println("Your weight would be " + Uranus + " pounds on that planet.");
        }
        else if (number == 6){
            System.out.println("Your weight would be " +  Neptune + " pounds on that planet.");
        }


    }
    }