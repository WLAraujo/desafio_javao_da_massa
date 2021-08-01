/* Leia um número inteiro que represente um código de DDD, em seguida informa a qual cidade o DDD pertence.
Cidades e DDDs: Brasilia, 61; Salvador, 71; São Paulo, 11; Rio de Janeiro, 21; Juiz de Fora, 32; Campinas, 19;
Vitória, 27; Belo Horizonte, 31. Caso seja inserido um DDD não cadastrado devolver "DDD não cadastrado"*/

import java.util.Scanner;

public class DDD{
    public static void main(String arg[]){
        Scanner ent = new Scanner(System.in);

        System.out.println("Por favor digite o DDD da cidade desejada.");
        int ddd = ent.nextInt();

        switch (ddd){
            case 61:
                System.out.println("Brasília");
                break;
            case 11:
                System.out.println("São Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 32:
                System.out.println("Juíz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitória");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD não cadastrado");
        }
    }
}