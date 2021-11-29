import java.util.Random;
public class Array5 {
    public static void main(String[] args) {

    int [] arr = {1,2,3,4,5};

    for(int i = 0; i < arr.length; i++){
        System.out.println(i + " " + arr[i]);

    }
    int temp;

    int start = 0;
    int end = arr.length-1;

    while(start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }

    System.out.println("reverse order");

        for(int j = 0; j < arr.length; j++){
            System.out.println(j + " " + arr[j]);

        }


    }
}
