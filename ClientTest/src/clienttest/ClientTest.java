/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttest;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gpn
 */
public class ClientTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client;
        String InternetProtocol = JOptionPane.showInputDialog("Enter IP address: ");
        client = new Client(InternetProtocol);
        client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.startRunning();
    }
    
}
