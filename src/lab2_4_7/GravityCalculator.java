package lab2_4_7;

/**
 * Created by R2-D2 on 21.02.2016.
 */
public class GravityCalculator {
    // x(t) = 0.5 × at 2 + vit + xi
    private static final double a = 9.81;
    public static double calcDist(double t){
        return 0.5*a*Math.pow(t,2);
    }

    public static void main(String[] args) {
        System.out.println(calcDist(10));
    }
}
