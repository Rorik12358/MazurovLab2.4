package lab2_4_5;

/**
 * Created by R2-D2 on 20.02.2016.
 */
public class MyCalc {
    //π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
    public static double calcPi(int n){
        double res = 0;
        int k = 0;
        for(int i = 0; i < n; i++){
            int denominator = 1+2*k;
            res+= 4./denominator;
            k++;
            denominator = 1+2*k;
            res -= 4./denominator;
            k++;
        }
        return res;
    }
}
