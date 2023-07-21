package personal.arryPackage;

public class ArrayCount {
    public static void main(String[] args) {
        final  int arrayFinal =10;
        int[] array= new int[arrayFinal];

        for (int counter = 0; counter < arrayFinal; counter++) {
            array[counter]= 2+ 2 * counter;
            System.out.println(counter +"   "+array[counter]);
        }

    }
}
