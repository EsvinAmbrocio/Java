package Java.curso;
import java.util.Scanner;

public class VowelCounter{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba la cadena");
    String cadena = sc.nextLine();
    int[] cantidad = new int[10];
    Character[] letters = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', };

    for(int letter = 0; letter < letters.length ; letter++){

      for(int Detector = 0; Detector < cadena.length(); Detector++){

        if(cadena.charAt(Detector) == letters[letter]){
          cantidad[letter] += 1;
          
        }
      }
      if(cantidad[letter] != 0){
        System.out.println(letters[letter]+": "+cantidad[letter]);

      }
    }
    sc.close();
  }
}