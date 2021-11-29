import java.util.Random;
public class Arrays2 {
    public static void main(String[] args) {
        Random random = new Random();
        int count=0;
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {



            Random number = new Random();
            int num = random.nextInt(6) + 1;
            System.out.println(num);
            arr[i] = num;




            if (num < 2) {
                count++;
            }


        }

        System.out.println("one is" + count);


    }


}
