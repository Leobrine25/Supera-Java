package Desafio_3;

import java.util.*;

public class Desafio_3 {

    public static void main(String[] args) {

        try (Scanner myObj = new Scanner(System.in)) {
            
            System.out.println("insira N e K:");
            //Ex: 5 2
            int n = myObj.nextInt();
            int k = myObj.nextInt();

            System.out.println("insira os Valores do Array");
            //Ex: 1 5 3 4 2

            int[] arr = new int[n];
            for(int i=0; i<n;i++) arr[i] = myObj.nextInt();
            
            int nPares = 0;

            //Ira checar o numero que está(I) e os proximos(I++ -> N), se checar os anteriores irá duplicar o resultado
            for (int i = 0; i < n; i++){
                for (int j = i + 1; j < n; j++)
                    if (arr[i] - arr[j] == k || arr[j] - arr[i] == k)
                        nPares++;
            }
            
            System.out.println("Numeros de Pares:");
            System.out.println(nPares);

        }catch (Exception e) {
            System.out.println("Erro, Variavel precisa ser um numero inteiro");
        }

    }
}
