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
 
public class Terminal extends Node{
    static int qtdeTerminal = 0;
    public JPanel terminalPanel = new TerminalPanel(qtdeTerminal);
    
    public Terminal(){
        MoverLabel mouseController = new MoverLabel();
        this.setLocation(qtdeTerminal*5,0);
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Terminal.png")));
        this.setSize(71,60);
        this.setId(qtdeTerminal);
        this.setNome("terminal_"+qtdeTerminal);
        //this.setTipo("Terminal");
        this.addMouseListener(mouseController);  
        this.addMouseMotionListener(mouseController);
        this.setVisible(true);
        Terminal.upQtdeTerminal();
    }
    
    public static int getQtdeTerminal() {
        return qtdeTerminal;
    }

    public static void upQtdeTerminal() {
        Terminal.qtdeTerminal++;
    }
    
    @Override
    void exibirPropriedades(JScrollPane scrollPane) {
        scrollPane.setViewportView(terminalPanel);
        ((TerminalPanel)terminalPanel).enableP2P(isP2P);
        ((TerminalPanel)terminalPanel).enableCsma(isCsma);
        ((TerminalPanel)terminalPanel).enableWifi(isWifi);
    }
}*/