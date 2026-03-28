package com.mycompany.rmi_technology;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AdderRemote extends UnicastRemoteObject implements Adder {

    public AdderRemote() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return x + y;
    }
}