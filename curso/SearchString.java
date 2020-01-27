
package Java.curso;
public class SearchString{
  public static void main(String[] args) {
    String searchMe = "Victor Manuel Perez, Vittorio Giuseppe Perez, Jean Pier Andreé Perez";
    int max = searchMe.length();
    int numPs = 0;
    for (int i = 0; i < max; i++) {
      if(searchMe.charAt(i) != 'p'){
        continue;
      }
      numPs++;
    }
    System.out.println("Encontradas: " + numPs + "Ps encontradas en la cadena de texto");
  }
}