package rmi;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static void main(String args[]) {
        try {
            DatabaseRemote obj = new DatabaseRemote("D://4//IT//java-technologies-master//java-technologies-master//dasha.json");

            IDatabaseRemote stub = (IDatabaseRemote) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.createRegistry(12300);

            registry.bind("IDatabaseRemote", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}