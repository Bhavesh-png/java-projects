package com.mycompany.rmi_technology;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {
        try {
            Adder obj = new AdderRemote();

            Registry reg = LocateRegistry.createRegistry(6000);
            reg.rebind("ss", obj);

            System.out.println("Server started...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}