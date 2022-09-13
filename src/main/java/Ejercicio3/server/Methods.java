package Ejercicio3.server;
//LOPEZ DIAZ ALEJANDRA KINNERETH
public class Methods {
    public String addtion(int num1, int num2) {
        double result = 0.0;
        for(int i=num1+1; i<num2; i++){

            result += i;
        }
        return "Hola, la suma es: "+ result;
    }
}
