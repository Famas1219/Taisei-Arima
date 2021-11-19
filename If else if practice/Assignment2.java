import java.util.Scanner;

public class Assignment2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, What is your name?");
        String name = scanner.nextLine();
        System.out.println("OK" + " " + name + " " + "how old are you?");
        int age = scanner.nextInt();
        System.out.println(age + "; thx");
        if ( 15 > age ){
            System.out.println("You can't drive." + "" + name);
        }
        else if (age == 17 || age == 16){
           System.out.println("You can drive but not vote." + "" + name);



        }
        else if (age > 17 && age < 25){

            System.out.println("You can vote but not rent car." + " " + name);

        }



        else {
            System.out.println("You can de pretty much anything." + " " + name);
        }




    }
}
