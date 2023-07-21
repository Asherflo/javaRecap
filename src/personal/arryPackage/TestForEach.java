package personal.arryPackage;

public class TestForEach {
    public static void main(String[] args) {
//        int[] array = {23,89,7,4,4,5,67,9,67,45,3};
//        int total = 0;
//        for (int  number:array) {
//            total += number;
//        }
//        System.out.println(total);
//
        int sum = 0;
        int[] numbers= {2,67,90,98,65,43,11};
        for (int number:numbers) {
            System.out.println(number);
            sum= number+sum;

        }
        System.out.println();
        System.out.println(sum);



    }

}
