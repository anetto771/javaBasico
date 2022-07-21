package aula2;

public class RepetidorFor {
    public static void main(String[] args) {
        int limite =50;
        int tabuadas = 30;

        for(int i=0;i<limite; i++){
            System.out.println(i+" x "+tabuadas+" = "+(i*tabuadas));
            if((i*tabuadas)%4==0 && i!=0){
                System.out.println(" - multiplo de 4.");
            }
            if((i*tabuadas)%7==0 && i!=0){
                System.out.println(" - multiplo de 7.");
            }
        }
    }
}
