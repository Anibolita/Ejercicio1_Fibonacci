package org.anibal.fibonacci;

public class Fibonacci {

    public int compute(int number){

        int result;

        if (number>1){
            result = compute(number-1) + compute(number-2);  //función recursiva
        }
        else if (number==1) {  // caso base
            result = 1;
        }
        else if (number==0){  // caso base
            result = 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            result = -1;
        }

        return result;

    }

}
