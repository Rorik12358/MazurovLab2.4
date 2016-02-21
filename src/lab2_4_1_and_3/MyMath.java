package lab2_4_1_and_3;

/**
 * Created by m18 on 19.02.2016.
 */
public class MyMath {
    public static final double PI = 3.14;
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int el:arr){
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int el:arr){
            if (el > max) {
                max = el;
            }
        }
        return max;
    }
    // Task from 2.4.3
    public static double areaOfCircle(int radius){
        return Math.pow(radius,2)*PI;
    }
}
