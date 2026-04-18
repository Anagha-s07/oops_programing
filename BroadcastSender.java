import java.net.*;
import java.util.Scanner;

public class BroadcastSender {
    public static void main(String[] args) throws Exception {

        // Create DatagramSocket (no fixed port needed for sender)
        DatagramSocket socket = new DatagramSocket();

        // Enable broadcast mode (VERY IMPORTANT)
        socket.setBroadcast(true);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("255.255.255.255 ");
            String message = sc.nextLine();

            // Convert message to bytes
            byte[] buffer = message.getBytes();

            // Broadcast IP address
            // 255.255.255.255 → sends to all devices in LAN
            InetAddress broadcastIP = InetAddress.getByName("127.0.0.1");

            // Create packet with destination port (same for all receivers)
            DatagramPacket packet = new DatagramPacket(
                    buffer,
                    buffer.length,
                    broadcastIP,
                    9876
            );

            // Send broadcast message
            socket.send(packet);

            // Exit condition
            if (message.equalsIgnoreCase("Bye")) {
                System.out.println("Broadcast ended by sender.");
                break;
            }
        }

        socket.close();
    }
}
