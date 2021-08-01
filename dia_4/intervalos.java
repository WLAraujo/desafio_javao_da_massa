/* Leia um valor real qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos este valor se
encontra: [0, 25], (25,50], (50,75], (75, 100]. Se o valor não estiver em nenhum desses intervalos
imprima uma mensagem dizendo isso.*/

import java.util.Scanner;

public class intervalos{
    public static void main(String args[]){

        Scanner ent = new Scanner(System.in);
        double valor;

        System.out.println("Digite um valor:");
        valor = ent.nextDouble();

        if(valor >= 0 && valor <=25){
            System.out.println("Número no intervalo [0,25]");
        }
        else if(valor > 25 && valor <= 50){
            System.out.println("Número no intervalo (25,50]");
        }
        else if(valor > 50 && valor <= 75){
            System.out.println("Número no intervalo (50,75]");
        }
        else if(valor > 75 && valor <= 100){
            System.out.println("Número no intervalo (75, 100]");
        }
        else{
            System.out.println("Valor fora do intervalo!!!");
        }

        ent.close();
    }
}
