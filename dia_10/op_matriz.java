/* Crie um programa que leia uma letra que representa uma operação (s para soma e m para media) com todos os 
elementos abaixo da diagonal principal de uma matriz dada também na entrada. A matriz deve ter dimensões 
nxn onde n está entre 2 e 12. Para ler a matriz passe o valores separados por espaço.*/

import java.util.Scanner;

public class op_matriz{
    public static void main (String args[]){

        Scanner ent = new Scanner(System.in);

        int tam = 0;
        while(tam > 12 || tam < 2){
            System.out.println("Digite o tamanho da matriz (valor entre 2 e 12):");
            tam = ent.nextInt();
        }   
        
        
        float M[][] = new float[tam][tam];
        for(int lin=0; lin<tam; lin++){
            System.out.println("Digite todos os valores da linha " + (lin+1));
            for(int col=0; col<tam; col++){
                M[lin][col] = ent.nextInt();
            }
        }

        char op = 'x';
        while(op != 's' && op != 'm'){
            System.out.println("Digite a operação que deseja realizar, s para soma e m para média:");
            op = ent.next().charAt(0);
        }

        float soma = 0;
        int count = 0;

        for(int lin=1; lin<tam; lin++){
            for(int col=0; col<=lin-1; col++){
                soma += M[lin][col];
                count += 1;
            }
        }

        float media = soma / count;

        if(op == 's'){
            System.out.println("O valor da soma é: " + soma);
        }
        else{
            System.out.println("O valor da média é: " + media);
        }
        
        ent.close();

    }
}