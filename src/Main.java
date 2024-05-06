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


    }
}