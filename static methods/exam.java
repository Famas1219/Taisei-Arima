

public class exam {
    public static int[] delete(int [] arr){
        int newarr[] = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            newarr[i] = arr[i];
        }

        return newarr;
    }

    public static void main(String[] args) {




        int [] arr= {1,2,3,4};


        for (int d = 0; d < arr.length; d++){
            System.out.println(d + " " + arr[d]);
        }

        System.out.println("Delete Value");

        arr = delete(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }


    }




}
