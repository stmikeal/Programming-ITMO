
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike
 */
public class Client {
       public static void main(String[] args) throws IOException{
           
       Socket s = new Socket("127.0.0.1", 1111);
       ObjectOutputStream o = new ObjectOutputStream(s.getOutputStream());
       o.writeObject("asd");
       }
       
}
