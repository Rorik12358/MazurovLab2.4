package lab2_4_2;

import lab2_4_1_and_3.MyMath;

import java.util.Arrays;

/**
 * Created by m18 on 19.02.2016.
 */
public class Calculation {
    public static void main(String[] args) {
        int[] arr1 = {1,5,7,8,2,0};
        int[] arr2 = {7,2,19,17};
        int max1 = MyMath.findMax(arr1);
        int min1 = MyMath.findMin(arr1);
        int max2 = MyMath.findMax(arr2);
        int min2 = MyMath.findMin(arr2);
        System.out.println("min of "+ Arrays.toString(arr1)+" is "+min1+" and it's max is "+max1);
        System.out.println("min of "+ Arrays.toString(arr2)+" is "+min2+" and it's max is "+max2);
    }
}
