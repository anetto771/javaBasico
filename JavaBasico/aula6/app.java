package aula6;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual forma deseja executar?");
        String opcao=entrada.nextLine();
        System.out.println("Voce escolheu o: "+opcao);
        switch (opcao){
            case "quadrado":
            Quadrado q1 = new Quadrado();
            System.out.println("----- --------- ---------");
            System.out.println(q1.getNomeFigura());
            System.out.println("Informe o lado da figura: ");
            q1.setLado(entrada.nextInt());
            System.out.println("Area: "+q1.getArea());
            System.out.println("Perimetro: "+q1.getPerimetro());
            break;
            case "triangulo":
            Triangulo t1 = new Triangulo();
            System.out.println("----- --------- ---------");
            System.out.println(t1.getNomeFigura());
            System.out.println("Altura: ");
            t1.setAltura(entrada.nextInt());
            System.out.println("Base: ");
            t1.setBase(entrada.nextInt());
            System.out.println("Lado A: ");
            t1.setLadoA(entrada.nextInt());
            System.out.println("Lado B: ");
            t1.setLadoB(entrada.nextInt());
            System.out.println("Lado C: ");
            t1.setLadoC(entrada.nextInt());
            System.out.println("Area: "+t1.getArea());
            System.out.println("Perimetro: "+t1.getPerimetro());
            break;
            case "trapezio":
            Trapezio tp1 = new Trapezio();
            System.out.println("----- --------- ---------");
            System.out.println(tp1.getNomeFigura());
            System.out.println("Altura: ");
            tp1.setAltura(entrada.nextInt());
            System.out.println("Base Maior: ");
            tp1.setBaseMaior(entrada.nextInt());
            System.out.println("Base Menor: ");
            tp1.setBaseMenor(entrada.nextInt());
            System.out.println("Lado A: ");
            tp1.setLadoA(entrada.nextInt());
            System.out.println("Lado B: ");
            tp1.setLadoB(entrada.nextInt());
            System.out.println("Area: "+tp1.getArea());
            System.out.println("Perimetro: "+tp1.getPerimetro());
            break;

            default:
            System.out.println("Não é uma figura valida!");
            break;
        }
    }
}
