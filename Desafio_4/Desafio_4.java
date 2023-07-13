package Desafio_4;

import java.util.*;

public class Desafio_4 {
    public static void main(String[] args) {
		
        try (Scanner leitor = new Scanner(System.in)) {
            
            System.out.println("insira o numero de quantidade de Frases");
            int n = leitor.nextInt();
            
            String frase;
            ArrayList<String> saida = new ArrayList<String>();

            for (int i = 0; i < n; i++) {
                do {
                    frase = leitor.nextLine();
                }while (frase.isEmpty());

            	StringBuilder metade1 = new  StringBuilder();
            	StringBuilder metade2 = new StringBuilder();

                metade1.append(frase.substring(0, frase.length() / 2));
                metade2.append(frase.substring(frase.length() / 2, frase.length()));

            	metade1.reverse();
            	metade2.reverse();

            	saida.add(metade1.toString() + metade2.toString());
                
                frase = "";
            }

            System.out.println("\nSaida:");
            for (String i : saida) {
                System.out.println(i);
              }

        }catch (Exception e) {
            System.out.println("Erro, Primeira variavel precisa ser um numero inteiro");
        }
	}
}
