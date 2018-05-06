/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertest;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author gpn
 */
public class ServerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Server server = new Server();      
        server.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        server.startRunning();
    }
    
}
