import java.util.Random;
public class Arrays {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int i =0;

        int sum= 0;
        double average= 0;
        int[] array = new int[10];
        for (i=0; i < array.length; i++) {


            Random number = new Random();
            int num = random.nextInt(100) + 1;
            System.out.println(num);
            sum=sum + num;
            array[i] = num;
            }
        System.out.println("sum is:"+sum);
        System.out.println("average is: "+(double)sum/ array.length);
    }
        }










