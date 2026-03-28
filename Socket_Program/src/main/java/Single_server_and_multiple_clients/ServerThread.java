package Single_server_and_multiple_clients;

import java.io.*;
import java.net.*;

public class ServerThread extends Thread {

    Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    public void run() {

        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String line;

            while ((line = in.readLine()) != null) {

                if (line.equalsIgnoreCase("QUIT")) {
                    break;
                }

                System.out.println("Client says: " + line);

                out.println("Echo: " + line);
            }

            s.close();

        } catch (Exception e) {
            System.out.println("Thread error: " + e);
        }
    }
}