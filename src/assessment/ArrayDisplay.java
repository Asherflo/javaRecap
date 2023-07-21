package assessment;

public class ArrayDisplay {
        public static void main(String[] args) {
            int[][] number = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            theArray(number);
        }

        public static void theArray(int[][] number) {

            for (int i = 0; i < number.length; i++) {
                for (int j = 0; j < number[i].length; j++) {
                    System.out.print(number[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

//}
//    static  void theArray(int arr[][]){
//        for (int i = 1; i < arr.length ; i++)
//            for (int j = 1; j < arr.length; j++) {
//
//            }
//
//
//    }
//    public static void main(String[] args) {
//        int a[] = {33,3,4,5};
//        min(a);
//}
