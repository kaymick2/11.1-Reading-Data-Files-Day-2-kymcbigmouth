import java.io.*;
import java.util.Scanner;

import java.net.*;

class Main {
  public static void main(String[] args) throws Exception {
    Scanner console = new Scanner(System.in);
    System.out.print("Input Filename: ");
    String inputFileName = console.next();

    // let's make da file!!!!!! pog!!!!!
    File readFile = new File(inputFileName);
    Scanner fileReadIn = new Scanner(readFile);

    // ableton loops but java
    String nomePais = null;
    String populacaoPais = null;
    String line = fileReadIn.nextLine();
    for (int lineNo = 1; fileReadIn.hasNextLine(); lineNo++) {
      line = fileReadIn.nextLine();
      int i = 0;

      while (!Character.isDigit(line.charAt(i))) {

        i++;
      }
      nomePais = line.substring(0, i);
      populacaoPais = line.substring(i);
      nomePais = nomePais.trim();
      populacaoPais = populacaoPais.trim();
      System.out.println(nomePais);
      System.out.println(populacaoPais);

    }
    // PARTE DOIS!!!!!!KKKKKKKKKKKKKKK
    String address = "http://digicrime.com/dc.html";
    URL digiCrime = new URL(address);
    Scanner digiScan = new Scanner(digiCrime.openStream());
    for (int HTMLNo = 1; digiScan.hasNextLine(); HTMLNo++) {
      String digiLine = digiScan.nextLine();
      System.out.println(digiLine);
    }

  }
}