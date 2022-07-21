package aula2;

import java.util.Random;

public class SaldoBanco {
    public static void main(String[] args) {
        double saldoInicial = 10000;
        Random aleatorio = new Random();
        double credito = 0;
        double debito = 0;
        int pagina = 12;

        for(int i=0;i< pagina;i++){
            double transacao = aleatorio.nextInt(-2500, 5000);
            System.out.println("-----------------------------------------------------------------------");
            saldoInicial += transacao;
            if(transacao < 0){
                System.out.println("Foi retirado " + i + " a sua conta. Seu saldo atual e igual a " + saldoInicial);
                debito += transacao;
            }else{
                System.out.println("Foi adicionado " + i + " da sua conta. Seu saldo atual e igual a " + saldoInicial);
                credito += transacao;
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Credito = " + credito);
        System.out.println("Debito = " + debito);
        System.out.println("Seu saldo final e = " + saldoInicial);
    }
}
