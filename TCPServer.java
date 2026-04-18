import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2665);
            System.out.println("Server is waiting for the client.....");

            Socket s = ss.accept();
            System.out.println("CONNECTION ESTABLISHED !!!");

            BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream())
            );

            PrintWriter pw = new PrintWriter(
                s.getOutputStream(), true
            );

            Scanner sc = new Scanner(System.in);

            while (true) {
                // Receive from client
                String clientMsg = br.readLine();
                System.out.println("CLIENT: " + clientMsg);

                if (clientMsg.equalsIgnoreCase("Bye")) {
                    System.out.println("Client ended the chat.");
                    break;
                }

                // Send reply
                System.out.print("SERVER: ");
                String serverMsg = sc.nextLine();
                pw.println(serverMsg);

                if (serverMsg.equalsIgnoreCase("Bye")) {
                    System.out.println("Server ended the chat.");
                    break;
                }
            }

            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
