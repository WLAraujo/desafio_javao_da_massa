/* Receba 5 números de entrada, depois mostre quantos números são pares, quantos números são ímpares, quantos números são positivos e quantos
números são positivos*/

import java.util.Scanner;

public class paridade_sinal{
    public static void main (String args[]){
        Scanner ent = new Scanner(System.in);
        int nums[] = new int[5];
        int par = 0, impar = 0, pos = 0, neg = 0;

        for(int i=0; i<5; i++){
            System.out.println("Digite o número " + (i+1));
            nums[i] = ent.nextInt();
            if(nums[i]%2 == 0){
                par +=1;
            }
            else{
                impar +=1;
            }
            if(nums[i] >= 0){
                pos +=1;
            }
            else{
                neg +=1;
            }
        }

        System.out.println("Ao todo temos:\n1-)Números pares = " + par + "\n2-)Números ímpares = " + impar + "\n3-)Números positivos = " +
        pos + "\n4-)Números negativos = " + neg);


        ent.close();
    }
}