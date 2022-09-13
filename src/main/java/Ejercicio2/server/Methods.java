package Ejercicio2.server;
//LOPEZ DIAZ ALEJANDRA KINNERETH
public class Methods {
    public String addtion(double num1, double num2, double num3, double num4) {
        double producto = num1*num2*num3*num4;
        double suma = num1+num2+num3+num4;
        double promedio = ((num1+num2+num3+num4)/4);
        return "Hola, el producto es: "+ producto+ " la suma es: "+ suma+ " y el promedio es: "+promedio;
    }
}
