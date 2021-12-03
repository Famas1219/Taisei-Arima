

class examp {

    public static int[] insertX(int n, int arr[],
                                int x, int pos) {
        int i;

        int newarr[] = new int[arr.length + 1];

        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }


    public static void main(String[] args) {





        int arr[]
                = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int d = 0; d < arr.length; d++) {
            System.out.println(d + " " + arr[d]);
        }

        System.out.println("insert value " + "index num" );



        arr = insertX(10, arr, 9, 9);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }

        System.out.println("insert value " + "index num");









    }
}



