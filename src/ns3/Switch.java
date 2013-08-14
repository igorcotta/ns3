package ns3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 
package ns3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author João
 
public class Switch extends Node {
    static int qtdeSwitch = 0;
    private JPanel switchPanel = new SwitchPanel(qtdeSwitch + 1);

    public Switch() {
        MoverLabel mouseController = new MoverLabel();
        this.setLocation(qtdeSwitch*5,0);
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Switch.png")));
        this.setSize(85,71);
        this.setId(qtdeSwitch);
        this.setNome("switch_"+qtdeSwitch);
        //this.setTipo("Switch");
        this.addMouseListener(mouseController);  
        this.addMouseMotionListener(mouseController);
        this.setVisible(true);
        Switch.upQtdeSwitch();
    }
    
    public static int getQtdeSwitch() {
        return qtdeSwitch;
    }

    public static void upQtdeSwitch() {
        Switch.qtdeSwitch++;
    }

    @Override
    void exibirPropriedades(JScrollPane scrollPane) {
        scrollPane.setViewportView(switchPanel);
    }
}*/