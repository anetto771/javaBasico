package aula3;

import java.util.ArrayList;

public class Matriz {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        int c=2;

        for(int i = 0; i<c;i++){
            matriz.add(new ArrayList<>());
        }

        //#region Abastecimento da Matriz
        matriz.get(0).add(1); //[0,0]
        matriz.get(0).add(1); //[0,1]
        matriz.get(0).add(15); //[0,2]
        matriz.get(1).add(4); //[1,0]
        matriz.get(1).add(2); //[1,1]
        matriz.get(1).add(18); //[1,2]
        //#endregion
        System.out.println("1a eq: "+matriz.get(0));
        System.out.println("2a eq: "+matriz.get(1));

        double y=((matriz.get(1).get(0) * matriz.get(0).get(2))-matriz.get(1).get(2)) / ((matriz.get(1).get(0)*matriz.get(0).get(1))+matriz.get(1).get(1));
        double x = (matriz.get(0).get(2) - y);
        System.out.println(y);
        System.out.println(x);
    }  
}
