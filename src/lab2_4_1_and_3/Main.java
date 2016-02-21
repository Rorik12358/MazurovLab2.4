package lab2_4_1_and_3;

/**
 * Created by m18 on 19.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,10,5,19,-20,222};
        int max = MyMath.findMax(new int[]{1,2,3,4});
        int min = MyMath.findMin(arr);
        System.out.println("max is "+max+" and min is "+min);
        double areaOfCircle1 = MyMath.areaOfCircle(1);
        double areaOfCircle2 = MyMath.areaOfCircle(5);
        System.out.println("area Of Circle with radius 1 is "+areaOfCircle1);
        System.out.println("area Of Circle with radius 5 is "+areaOfCircle2);
    }
}
