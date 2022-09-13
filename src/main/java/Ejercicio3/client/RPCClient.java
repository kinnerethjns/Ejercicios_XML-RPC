package Ejercicio3.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
//LOPEZ DIAZ ALEJANDRA KINNERETH
public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.println("Hola, ingrese el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        Object[] data = {num1,num2};
        String response = (String) client.execute("Methods.addtion",data);
        System.out.println(response);
    }
}
