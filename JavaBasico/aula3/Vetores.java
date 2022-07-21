package aula3;

import java.util.Random;

public class Vetores {
    public static void main(String[] args) {
        Random a = new Random();

        double[] valores = {
                a.nextInt(30),
                a.nextInt(70),
                a.nextInt(90),
                a.nextInt(120),
                a.nextInt(150),
                a.nextInt(180),
                a.nextInt(240)
        };
        double[] comparadores = {
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10)
        };
        if (valores.length == comparadores.length) {
            for (int i = 0; i < valores.length; i++) {
                if (valores[i] % comparadores[i] == 0) {
                    System.out.println("[" + i + "]= " + valores[i]
                            + " - " + "[" + i + "]= " + comparadores[i]+" multiplos: (sim)");
                } else {
                    System.out.println("[" + i + "]= " + valores[i]
                            + " - " + "[" + i + "]= " + comparadores[i]+" multiplos: (não)");
                }
            }
        } else {
            System.out.println("Vetores com tamanho diferente.");
        }
    }
}