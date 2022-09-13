package Ejercicio3.server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;
//LOPEZ DIAZ ALEJANDRA KINNERETH
public class RPCServer {
    public static void main(String[] args) throws XmlRpcException, IOException {
        System.out.println("Initializing server...");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.addHandler("Methods", Methods.class);

        WebServer server = new WebServer(1200);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();
        System.out.println("Server running in http://localhost:1200");
        System.out.println("Waiting requests...");
    }
}