/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ns3;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author João
 */
public class NS3 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        PrincipalFrame frame = new PrincipalFrame();
        
        frame.setTitle("Simulador de rede NS3");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}