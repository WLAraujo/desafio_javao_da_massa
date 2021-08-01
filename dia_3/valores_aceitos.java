/* Leia 4 valores inteiros A, B, C e D. Se B > C, D > A, C+D > A+B, C > 0, D > 0 e A é par, imprimir
"Valores Aceitos", senão imprimir "Valores Não Aceitos".
*/

import java.util.Scanner;

public class valores_aceitos{
    public static void main(String args[]){

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros separados por espaço:");

        int A = ent.nextInt();
        int B = ent.nextInt();
        int C = ent.nextInt();
        int D = ent.nextInt();

        if((B > C) && (D > A) && (C+D > A+B) && (C > 0) && (D > 0) && ((A%2) == 0)){
            System.out.println("Valores Aceitos!!!");
        }
        else{
            System.out.println("Valores não aceitos!!!");
        }

        ent.close();
    }
}