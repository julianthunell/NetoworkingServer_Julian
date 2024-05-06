import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket client;

        // Default port
        int portNumber = 1234;
        if(args.length >= 1){
            portNumber = Integer.parseInt(args[0]);
        }

        //Create server side socket
        try{
            server = new ServerSocket(portNumber);
        }
        catch (IOException ie){
            System.out.println("Cannot open socket");
            System.exit(1);
        }
        System.out.println("ServerSocket is created" + server);

        //Recieve data from client
        while (true){
            try{
                //Listens for a connection
                System.out.println("Waiting for connect request...");
                client = server.accept();

                System.out.println("Connect request is accepted...");
                String clientHost = client.getInetAddress().getHostAddress();

                int clientPort = client.getPort();
                System.out.println("Client host = " + clientHost + "client port = " + clientPort);

                //Read data from client
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));

                String messageFromClient = br.readLine();
                System.out.println("Message recieved from client = "); messageFromClient)


            }
        }

    }
}