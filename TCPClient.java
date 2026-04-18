import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.6.89", 2665);

            BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream())
            );

            PrintWriter pw = new PrintWriter(
                s.getOutputStream(), true
            );

            Scanner sc = new Scanner(System.in);

            while (true) {
                // Send to server
                System.out.print("CLIENT: ");
                String clientMsg = sc.nextLine();
                pw.println(clientMsg);

                if (clientMsg.equalsIgnoreCase("Bye")) {
                    System.out.println("Client ended the chat.");
                    break;
                }

                // Receive from server
                String serverMsg = br.readLine();
                System.out.println("SERVER: " + serverMsg);

                if (serverMsg.equalsIgnoreCase("Bye")) {
                    System.out.println("Server ended the chat.");
                    break;
                }
            }

            s.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
