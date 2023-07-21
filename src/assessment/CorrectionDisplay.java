package assessment;

public class CorrectionDisplay {
    static  double squareNumber(double number){
        return Math.pow(number,4.8);
    }
    static  void displayArray(int[][] values){
        if(values == null || values.length ==0)
            System.out.println("Array cannot be empty");
        for (int row = 0; row < values.length; row++) {
            for (int column = 0; column < values[row].length; column++) {
                System.out.print(values[row][column] +" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("find the square of a number.");
        System.out.println(squareNumber(7));
        System.out.println("display the content of 2D array");
        displayArray(new int[][]{{3,5,7},{6,9,0},{6,7,4}});

    }
}
