/* O programa receberá um número inteiro n entre 1 e 20, depois receberá n números inteiros e dirá se eles são números perfeitos ou
não */

import java.util.Scanner;

public class num_perfeito{
    public static void main (String args[]){
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite a quantidade de números");
        int qntd = ent.nextInt();
        int num;
        int soma;
        
        for(int i=1; i<=qntd; i++){
            System.out.println("Digite o número " + i);
            num = ent.nextInt();
            soma = 0;
            if(num == 1){
                System.out.println(num + " é um número perfeito!");
            }
            else{
                for(int j=1; j<num; j++){
                    if(num%j == 0){
                        soma += j;
                    }
                }
                if(soma == num){
                    System.out.println(num + " é um número perfeito!");
                    }
                    else{
                    System.out.println(num + " não é um número perfeito!");
                }
            }
        }


    }
}