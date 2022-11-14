import java.util.Scanner; //Sirve para leer por teclado
import java.lang.Math; //Sirve para añadir funciones matematicas



public class nAleatorio {

  public static void main(String[] args){ //main para que la clase contenga codigo ejecutable
    double contador_exitos1 = 0;
    double contador_exitos2 = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el número de iteraciones:");
    double n = s.nextInt(); //Pido que busque el primer entero en el buffer leido en el scanner

    for(int i = 0; i < n; ++i){
      double x = Math.random();
      double y = Math.random();

      //El metodo montecarlo consiste en lanzar puntos aleatorios y ver
      if ( y <= f(x) )
        ++contador_exitos1;
      if ( y <= g(x) )
        ++contador_exitos2;
    }
    System.out.println("Integral aproximada f(x) = sin(x): " + (contador_exitos1/n));
    System.out.println("Integral aproximada g(x) = x: " + (contador_exitos1/n));

    s.close(); //hay que cerrar el buffer del scanner. Recuerda a FILE en c
  }

  public static double f(double x){
    return Math.sin(x);
  }

  public static double g(double x){
    return x;
  }
}