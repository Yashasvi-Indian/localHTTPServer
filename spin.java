 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.net.ServerSocket;
import java.net.Socket;
public class spin{
  public static void main(String[] args) throws Exception {
    final ServerSocket server = new ServerSocket(5500);
    System.out.println("Listening for connection on port 8080 ....");
    while (true){
      // spin forever
    
    final   Socket clientSocket = server.accept();  
   
    InputStreamReader isr 
          =  new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();            
            while (!line.isEmpty()) {
                System.out.println(line);
                line = reader.readLine();   }
}
}}
