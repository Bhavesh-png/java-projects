package Single_server_and_multiple_clients;

import java.net.*;
import java.io.*;

public class Client {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 4445);

            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String line;

            System.out.println("Enter message (type QUIT to exit):");

            while ((line = userInput.readLine()) != null) {

                out.println(line);

                if (line.equalsIgnoreCase("QUIT")) {
                    break;
                }

                String response = in.readLine();
                System.out.println("Server: " + response);
            }

            s.close();

        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}