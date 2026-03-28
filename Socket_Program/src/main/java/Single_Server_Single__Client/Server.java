package Single_Server_Single__Client;
import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(2553);
        System.out.println("Server is waiting...");

        Socket s1 = ss.accept();
        System.out.println("Client connected");

        DataInputStream dis = new DataInputStream(s1.getInputStream());
        DataOutputStream dos = new DataOutputStream(s1.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str1 = "";

        while (!str.equals("stop")) {

            str = dis.readUTF();
            System.out.println("Client says: " + str);

            str1 = br.readLine();
            dos.writeUTF(str1);
            dos.flush();
        }

        dis.close();
        dos.close();
        s1.close();
        ss.close();
    }
}