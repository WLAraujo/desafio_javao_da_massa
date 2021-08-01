/* Leia um número n entre 1 e 100, crie um vetor de inteiros com n posições que não contenha um valor repetido. Apresente o menor valor
contido nesse vetor e a posição desse valor dentro do vetor*/

/*DESAFIO: RESOLVER O PROBLEMA ACIMA SEM USAR VETORES*/

import java.util.Scanner;

public class menor_pos_s_vetor{
    public static void main (String args[]){

        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor:");
        int tam = ent.nextInt();

        System.out.println("Digite os número:");
        int val = ent.nextInt();
        int menor = val;
        int menor_pos = 1;
        for(int i=2; i<=tam; i++){
            val = ent.nextInt();
            if(menor > val){
                menor = val;
                menor_pos = i;
            }
        }

        System.out.println("O menor valor é " + menor + " na posição " + (menor_pos));

        ent.close();

    }
}
