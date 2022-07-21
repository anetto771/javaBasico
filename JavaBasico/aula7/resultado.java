package aula7;

import java.util.Scanner;

public class resultado extends Equacao {
    public static void main(String[] args) {

        Delta dt = new Delta();
        EqXn xnXp = new EqXn();
        Scanner entrada = new Scanner(System.in);

        System.out.println("qual o valor do A?");
        dt.setA(entrada.nextDouble());
        System.out.println("qual o valor do B?");
        dt.setB(entrada.nextDouble());
        System.out.println("qual o valor do C?");
        dt.setC(entrada.nextDouble());
        dt.calculaDelta();
        System.out.println("resultado de delta: " + dt.getDelta());
        if (dt.getDelta() < 0) {
            System.out.println("A equacao nao possui raizes reais.");
        } else if (dt.getDelta() == 0) {
            System.out.println("A equação é positiva.");
        } else {
            System.out.println("xn :" + xnXp.calculaXn(dt));
            System.out.println("xp :" + xnXp.calculaXp(dt));
        }

    }
}
