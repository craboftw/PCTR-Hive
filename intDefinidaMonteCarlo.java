import java.lang.Math;
import java.util.Scanner;

public class intDefinidaMonteCarlo {

    public static void main(String[] args){
        double exito1 = 0;
        double exito2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero de iteraciones: ");
        double n = s.nextInt();
        s.close();
        System.out.println();

        for(int i = 0; i < n; ++i){
            double x = Math.random();
            double y = Math.random();
            if ( y <= f(x) )
                exito1++;
            if ( y <= g(x) )
                exito2++;
        }
        System.out.println("Integral aproximada f(x) = sin: " + (exito1/n));
        System.out.println("Integral aproximada g(x) = x: " + (exito2/n));
    }

    public static double f(double x){
        return Math.sin(x);
    }

    public static double g(double x){
        return x;
    }
}