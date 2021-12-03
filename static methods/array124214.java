

 public class array124214 {
    public static int[] add(int [] arr, int x){
        int newarr[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
        newarr[i] = arr[i];
        }
        newarr[newarr.length - 1] = x;
        return newarr;
    }

     public static void main(String[] args) {




         int [] arr= {1,2,3,4};


         for (int d = 0; d < arr.length; d++){
             System.out.println(d + " " + arr[d]);
         }

         System.out.println("Add Value");

         arr = add(arr, 5);
         for (int i = 0; i < arr.length; i++) {
             System.out.println(i + " " + arr[i]);
         }


     }




}
