/* Leia um número n entre 1 e 100, crie um vetor de inteiros com n posições que não contenha um valor repetido. Apresente o menor valor
contido nesse vetor e a posição desse valor dentro do vetor*/

import java.util.Scanner;

public class menor_pos{
    public static void main (String args[]){

        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor:");
        int tam = ent.nextInt();

        int vetor[] = new int[tam];
        for(int i=0; i<tam; i++){
            vetor[i] = ent.nextInt();
        }

        int menor = vetor[0];
        int menor_pos = 0;

        for(int i=0; i<tam; i++){
            if(vetor[i]<menor){
                menor = vetor[i];
                menor_pos = i;
            }
        }

        System.out.println("O menor valor é " + menor + " na posição " + (menor_pos+1));

        ent.close();

    }
}
