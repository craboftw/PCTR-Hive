import java.util.Scanner;
import java.lang.Math;

class newton_raphson_template {
    public static void main(String[] args){
        int contador_exitos = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce cuantas iteraciones van a realizarse");
        int n = s.nextInt();
        System.out.println("\nIntroduce el origen del intervalo: ");
        double xn = s.nextDouble();
        System.out.println("\nIntroduce el fin del intervalo: ");
        double x0 = s.nextDouble();
        double copiax0 = x0;

        s.close();
        for(int i=0;i < n; ++i)
        {
            xn = x0 - f(x0) / df(x0);
            //System.out.println("Con " + i + "iteraciones podemos aproximar que la raiz de f(x) esta en: " + xn);
            x0 = xn;
        }
        System.out.println("Con " + n + "iteraciones podemos aproximar que la raiz de f(x) esta en: " + xn);
        x0 = copiax0;

        for(int i=0;i < n; ++i)
        {
            xn = x0 - g(x0) / dg(x0);
         //   System.out.println("Con " + i + "iteraciones podemos aproximar que la raiz de g(x) esta en: " + xn);
            x0 = xn;
        }
        System.out.println("Con " + n + "iteraciones podemos aproximar que la raiz de g(x) esta en: " + xn);
    }


    public static double f(double x){
        return Math.cos(x) - Math.pow(x, 3);
    }

    public static double df(double x){
        return -Math.sin(x) - 3*Math.pow(x, 2);
    }

    public static double g(double x)
    {
        return Math.pow(x,2)-5;
    }

    public static double dg(double x)
    {
        return 2*x;
    }
}