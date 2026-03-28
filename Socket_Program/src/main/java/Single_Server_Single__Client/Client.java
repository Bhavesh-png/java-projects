package Single_Server_Single__Client;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception {

        Socket s1 = new Socket("localhost", 2553);

        DataInputStream dis = new DataInputStream(s1.getInputStream());
        DataOutputStream dos = new DataOutputStream(s1.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str1 = "";

        while (!str.equals("stop")) {

            System.out.print("Enter message: ");
            str = br.readLine();

            dos.writeUTF(str);
            dos.flush();

            str1 = dis.readUTF();
            System.out.println("Server says: " + str1);
        }

        dis.close();
        dos.close();
        s1.close();
    }
}
