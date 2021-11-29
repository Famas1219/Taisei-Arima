
public class Array4 {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6};



        for (int i = 0; i < arr.length; i++) {



            System.out.println(i + " " + arr[i]);
        }

        int swap = arr[arr.length - 1];
        arr[arr.length - 1] = arr[arr.length - 3];
        arr[arr.length - 3] = swap;




System.out.println("swap");



        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);

        }

    }
}