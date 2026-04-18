import java.net.*;

public class BroadcastReceiver {
    public static void main(String[] args) throws Exception {

        // Create socket and bind to port 9876
        // All receivers must use SAME port
        DatagramSocket socket = new DatagramSocket(9876);

        byte[] buffer = new byte[1024];

        System.out.println("Receiver is listening for broadcast messages...");

        while (true) {

            // Create packet to receive data
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            // Wait for incoming broadcast
            socket.receive(packet);

            // Convert received data into string (IMPORTANT: use getLength())
            String message = new String(
                    packet.getData(),
                    0,
                    packet.getLength()
            );

            // Get sender IP (optional, for display)
            InetAddress senderIP = packet.getAddress();

            System.out.println("Received from " + senderIP + " : " + message);

            // Exit condition
            if (message.equalsIgnoreCase("Bye")) {
                System.out.println("Broadcast ended.");
                break;
            }
        }

        socket.close();
    }
}
