/* O arquivo de entrada consiste em um valor inteiro e um valor real. O valor inteiro representa
a distância percorrida. O valor real representa o total de combustível gasto e possui um número decimal.
A saída deve ser o consumo médio de combustível por Km, tendo precisão de 3 casas após a virgula. */

import java.util.Scanner;

public class combustivel{
    public static void main (String args[]){

        Scanner ent = new Scanner(System.in);

        int dist;
        double comb, cons;

        dist = ent.nextInt();
        comb = ent.nextDouble();

        cons = dist/comb;

        System.out.printf("%.3f Km/L\n", cons);


        ent.close();
    }
}