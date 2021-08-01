/* Leia a idade do usuário em dias e devolva ela em ano, meses e dias. Considere que todos os anos tem
365 dias e que todos os meses tem 30 dias*/

import java.util.Scanner;

public class idade_em_dias{
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int idade_dias;
        int anos, meses, dias;

        idade_dias = ent.nextInt();

        anos = idade_dias / 365;
        meses = (idade_dias % 365) / 30;
        dias = (idade_dias % 365) % 30;

        System.out.println("A idade em dias " + idade_dias + " representa:");
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        ent.close();
    }
}

