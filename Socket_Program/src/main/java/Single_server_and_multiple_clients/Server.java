package Single_server_and_multiple_clients;

import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(4445);
            System.out.println("Server listening...");

            while (true) {
                Socket s = ss.accept();
                System.out.println("Connection established: " + s);

                ServerThread st = new ServerThread(s);
                st.start(); // multi-client support
            }

        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}
