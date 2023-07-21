package personal.arryPackage;

public class TriangleShape {
    public static void main(String[] args) {
//        int triangle[] = new int[8];
//        for (int counter = 0; counter < triangle.length; counter++) {
//            for (int i = 0; i < counter; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        int size = 8;
        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size-1; j++) {
////                System.out.print(" ");
//
//            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
