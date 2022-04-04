
package gestionesocket;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Server {
    
    public static void main(String[] args) {
        try {
            //1)Apertura alla porta, avvio del servizio
            ServerSocket serverSocket = new ServerSocket(2000);
            System.out.println("Server avviato correttamente");
            //2) Attesa di richiesta del server
            Socket socket = serverSocket.accept();
            System.out.println("Connessione avvenuta");
            System.out.println("Socket: " +socket);
            serverSocket.close();
            
        } catch(BindException ex){
                    System.err.println("Porta occupata");
                    }
        catch (IOException ex) {
            System.err.println("Errore avvio server sulla porta 2000");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
