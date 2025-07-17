package ForLoop.Pattern;

public class CenteredPyramidPattern {
    public static void main(String[] args) {
        int row = 7;

//        for (int i = 1; i <= row; i++) {
//            for(int j = 1; j <= row-i; j++) {
//                System.out.print(" ");
//            }
//            for(int k =1; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= row; i++) {
            String spaces = " ".repeat(row - i);
            String stars = "*".repeat(2 * i -1);
            System.out.println(spaces+ stars);
        }
    }
}
