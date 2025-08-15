import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
/* use serversocket & socket class */
public class response {
    public static void main(String args[]) throws IOException {

        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true) {
            try (Socket socket = server.accept()) {
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream()
                      .write(httpResponse.getBytes("UTF-8"));
            }
        }
    }
}
/*ServerSocket is used to receive connections in the Server application and Socket is used to send and receive data from the individual clients. */
