package Desafio_1;

import java.util.*;

public class Desafio_1 {
  public static void main(String[] args) {

    int entrada;
    ArrayList<Integer> positivo = new ArrayList<Integer>();
    ArrayList<Integer> negativo = new ArrayList<Integer>();
    
    System.out.println("Entre o valor N e as N entradas:");
    
    //Pega o que for digitado e já coloca na sua Array correta
    try (Scanner myObj = new Scanner(System.in)) {
      //valor N
      int N = myObj.nextInt();
      //Lê a entrada N vezes.
      for (int k=0;k < N; k++){
        entrada = myObj.nextInt();
        if ( entrada%2==0){
          positivo.add(entrada);
        }else{
          negativo.add(entrada);
        }
      }
    }

    //Sort menor para maior, e maior para menor
    Collections.sort(positivo);
    Collections.sort(negativo, Collections.reverseOrder());

    System.out.println("\nSaida:");

    for (int i : positivo) {
      System.out.println(i);
    }
    for (int i : negativo) {
      System.out.println(i);
    }
  }
}