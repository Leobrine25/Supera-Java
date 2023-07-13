package Desafio_2;

import java.util.*;

public class Desafio_2 {
    public static void main(String[] args) {
        //O(24);
        //iniciando as variaveis
        int[] quantidade_min = {0,0,0,0,0,0,0,0,0,0,0,0};
        //Por ser um valor inteiro, vou usar a moeda de 1 como "nota"
        int[] notas = {100,50,20,10,5,2,1}; 
        int[] moedas ={50,25,10,5,1};
        
        //Locale.US para Utilizar '.' na casa decinal
        try (Scanner myObj = new Scanner(System.in).useLocale(Locale.US)) {
            double entrada = myObj.nextDouble();

            //Dividindo o valor em inteiros(notas) e quebrados(moedas);
            int inteiros = (int) entrada;
            int quebrados = (int) ((entrada*100 - inteiros*100));
            System.out.println(inteiros);
            System.out.println(quebrados);
            
            //Como estou utilizando um vetor para Notas e outros para Moedas, 
            //preciso de um j para agiar como um segundo guia
            
            int j=0;
            for(int i= 0; i<quantidade_min.length;i++){
                if(i<=6){
                    quantidade_min[i]= inteiros/notas[i];
                    inteiros-=notas[i]*quantidade_min[i];
                }else{
                    quantidade_min[i]= quebrados/moedas[j];
                    quebrados-=moedas[j]*quantidade_min[i];
                    j++;
                }
            }

            //Mesmo Caso dito anteriormente
            j=0;
            System.out.println("Notas");
            for(int i= 0; i<quantidade_min.length;i++){
                if(i<6){
                    System.out.println(quantidade_min[i] + " nota(s) de R$ " + String.format("%.2f", (double)notas[i]));
                }else if(i==6){
                    System.out.println("MOEDAS: ");
                    System.out.println(quantidade_min[i] + " moeda(s) de R$ "+ String.format("%.2f",(double)notas[i]));
                }else{
                    System.out.println(quantidade_min[i] + " moeda(s) de R$ "+ String.format("%.2f",(double)moedas[j]/100));
                    j++;
                }
            }
        }catch (Exception e) {
            System.out.println("Erro, Variavel precisa ser um numero");
        }
    }
}
