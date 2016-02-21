package lab2_4_6;

/**
 * Created by R2-D2 on 21.02.2016.
 */
// Print Pyramid
public class printPyramid {
    public static void printPyramid(int n){
        for (int i = 1; i<=n; i++){
            for(int spaces = i; spaces < n; spaces++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int j = i-1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(3);
        System.out.println("----------------------------");
        printPyramid(9);

    }
}
