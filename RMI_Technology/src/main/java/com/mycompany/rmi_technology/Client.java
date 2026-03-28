package com.mycompany.rmi_technology;
import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            Adder stub = (Adder) Naming.lookup("rmi://localhost:6000/ss");

            int result = stub.add(20, 10);

            System.out.println("Addition = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
