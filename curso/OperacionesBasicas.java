package Java.curso;
import java.util.Scanner;
public class OperacionesBasicas{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n1 = 0;
    int n2 = 0;
    int suma;
    int resta;
    int multiplicacion;
    int dividir;

    System.out.println("Escriba el primer valor a operar");
    n1 = in.nextInt();
    System.out.println("Escriba el segundo valor a operar");
    n2 = in.nextInt();
    suma = n1 + n2;
    resta = n1 - n2;
    multiplicacion = n1 * n2;
    dividir = n1 / n2;
    in.close();
    
    System.out.println("El resulta de la suma es:");
    System.out.println(suma);
    System.out.println("El resulta de la resta es:");
    System.out.println(resta);
    System.out.println("El resulta de la multiplicacion es:");
    System.out.println(multiplicacion);
    System.out.println("El resulta de la dividir es:");
    System.out.println(dividir);
  }
}