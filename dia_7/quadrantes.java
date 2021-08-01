/* A entrada será um par de coordenadas que indicará um ponto no plano cartesiano. A saída deve ser qual quadrante o ponto pertence.
Para encerrar o programa uma das coordenadas deve ser 0. */

import java.util.Scanner;

public class quadrantes{
    public static void main(String args[]){
        
        Scanner ent = new Scanner(System.in);

        int x;
        int y;

        do{
            System.out.println("Digite os dois valores separados por espaço:");
            x = ent.nextInt();
            y = ent.nextInt();
            if(x>0 && y > 0){
                System.out.println("Primeiro Quadrante");
            }
            else if(x<0 && y>0){
                System.out.println("Segundo Quadrante");
            }
            else if(x<0 && y<0){
                System.out.println("Terceiro Quadrante");
            }
            else if(x>0 && y<0){
                System.out.println("Quarto Quadrante");
            }
        }while(x != 0 && y != 0);

        ent.close();

    }
}