
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike
 */
public class Server {
   public static void main(String[] args) throws IOException, ClassNotFoundException{
       Object b;
       ServerSocket ss = new ServerSocket(1111);
       Socket s = ss.accept();
       ObjectInputStream i = new ObjectInputStream(s.getInputStream());
       b = i.readObject();
       System.out.println(b.toString());
   }
    
}
