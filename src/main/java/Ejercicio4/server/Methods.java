package Ejercicio4.server;


import java.util.Arrays;
//LOPEZ DIAZ ALEJANDRA KINNERETH
public class Methods {
    public String addtion(int num1, int num2, int num3, int num4, int num5) {
        int numeros [] = {num1,num2,num3,num4, num5};
        Arrays.sort(numeros);
        for (int i=0; i<numeros.length; i++ ){
            System.out.println(""+numeros[i]);
        }
        return "los números en forma ascendente son: "+ numeros[0]+
                ", "+ numeros[1]+ ", " + numeros[2]+ ", " +numeros[3]+ ", " +numeros[4];
    }
}
