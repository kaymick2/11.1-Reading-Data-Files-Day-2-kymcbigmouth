import java.io.*;
import java.util.*;
import java.lang.*;
import javax.annotation.processing.Filer;

class Main {
  public static void main(String[] args) throws Exception {
    Scanner console = new Scanner(System.in);
    System.out.print("Input Filename: ");
    String inputFileName = console.next();

    // let's make da file!!!!!! pog!!!!!
    File readFile = new File(inputFileName);
    Scanner fileReadIn = new Scanner(readFile);

    // ableton loops but java
    int i = 1;
    String nomePais = null;
    String populacaoPais = null;
    for (int lineNo = 1; fileReadIn.hasNextLine(); lineNo++) {
      String line = fileReadIn.nextLine();
      while (!Character.isDigit(line.charAt(i))) {
        nomePais = line.substring(0, i);
        populacaoPais = line.substring(i);
        i++;
      }

      nomePais = nomePais.trim();
      populacaoPais = populacaoPais.trim();
      System.out.println(nomePais);
      System.out.println(populacaoPais);
    }
  }
}