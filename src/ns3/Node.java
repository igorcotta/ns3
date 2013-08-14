/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ns3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;



/**
 *
 * @author João
 */
public class Node extends JLabel{

    static final int TERMINAL = 0;
    static final int SWITCH = 1;
    static final int AP = 2;
    static final int ROUTER = 3;

    static int qtdeTerminal = 0;
    static int qtdeSwitch = 0;
    static int qtdeAccessPoint = 0;
    static int qtdeRouter = 0;
    static int qtde = 0;
    
    private String nome;
    private int tipo;
    private int id;
    
    public boolean isP2P = false;
    public boolean isCsma = false;
    public boolean isWifi = false;
    public boolean isTcp = false;
    public boolean isUdp = false;
    public boolean selected = false;

    public JPanel terminalPanel = new TerminalPanel(qtdeTerminal);
    public JPanel routerPanel = new RouterPanel(qtdeRouter);
    public JPanel switchPanel = new SwitchPanel(qtdeSwitch + 1);
    public JTable accessPointTable = new JTable();

    public boolean setRouteTable = false;
    
    public Node(int tipo){
        switch(tipo){
            case TERMINAL: {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Terminal.png")));
                    this.setSize(71,60);
                    this.setNome("terminal_"+Node.getQtde(tipo));
            }break;
            case SWITCH: {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Switch.png")));
                    this.setSize(85,71);
                    this.setNome("switch_"+Node.getQtde(tipo));
            }break;
            case ROUTER: {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Router.png")));
                    this.setSize(62,42);
                    this.setNome("router_"+Node.getQtde(tipo));
            }break;
            case AP: {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AccessPoint.png")));
                    this.setSize(71,56);
                    this.setNome("accessPoint_"+Node.getQtde(tipo));
            }break;
            
        }
        
        
        MoverLabel mouseController = new MoverLabel();
        this.setLocation(Node.getQtde()*5,0);
        this.setTipo(tipo);
        this.setId(Node.getQtde(tipo));
        this.addMouseListener(mouseController);
        this.addMouseMotionListener(mouseController);
        this.setVisible(true);
    }

    static void upQtde(int tipo){
        Node.qtde++;
        switch(tipo){
            case TERMINAL: {
                     Node.qtdeTerminal++;
            }break;
            case SWITCH: {
                     Node.qtdeSwitch++;
            }break;
            case AP: {
                     Node.qtdeAccessPoint++;
            }break;
            case ROUTER: {
                     Node.qtdeRouter++;
            }break;
        }
    }

    static void downQtde(int tipo){
        Node.qtde--;
        switch(tipo){
            case TERMINAL: {
                     Node.qtdeTerminal--;
            }break;
            case SWITCH: {
                     Node.qtdeSwitch--;
            }break;
            case AP: {
                     Node.qtdeAccessPoint--;
            }break;
            case ROUTER: {
                     Node.qtdeRouter--;
            }break;
        }
    }

    public static int getQtde(int tipo) {
        switch(tipo){
            case TERMINAL:
                     return qtdeTerminal;
            case SWITCH:
                     return qtdeSwitch;
            case AP:
                     return qtdeAccessPoint;
            case ROUTER:
                     return qtdeRouter;
        }
        return -1;
    }

    public static int getQtde(){
        return Node.qtde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public boolean isIsCsma() {
        return isCsma;
    }

    public void setIsCsma(boolean isCsma) {
        this.isCsma = isCsma;
    }

    public boolean isIsP2P() {
        return isP2P;
    }

    public void setIsP2P(boolean isP2P) {
        this.isP2P = isP2P;
    }

    public boolean isIsWifi() {
        return isWifi;
    }

    public void setIsWifi(boolean isWifi) {
        this.isWifi = isWifi;
    }

    public boolean isSelected(){
        return this.selected;
    }
    public void setSelected(boolean bool){
        this.selected = bool;
    }
    
    public boolean isTcp(){
        return this.isTcp;
    }
    public void setIsTcp(boolean bool){
        this.isTcp = bool;
    }
    
    public boolean isUdp(){
        return this.isUdp;
    }
    public void setIsUdp(boolean bool){
        this.isUdp = bool;
    }
    
    public void setTable(){
        setRouteTable = true;
    }
    
    public boolean isEnableTable(){
        return this.setRouteTable;
    }
    
    public void exibirPropriedades(int tipo, JScrollPane scrollPane){
        switch(tipo){
            case TERMINAL: {
                    scrollPane.setViewportView(terminalPanel);
                    ((TerminalPanel)terminalPanel).enableP2P(isP2P);
                    ((TerminalPanel)terminalPanel).enableCsma(isCsma);
                    ((TerminalPanel)terminalPanel).enableWifi(isWifi);
                    ((TerminalPanel)terminalPanel).enableTcp(isTcp);
                    ((TerminalPanel)terminalPanel).enableUdp(isUdp);
            }break;
            case SWITCH: {
                    scrollPane.setViewportView(switchPanel);
                    
            }break;
            case AP: {
                    scrollPane.setViewportView(accessPointTable);
            }break;
            case ROUTER: {
                    scrollPane.setViewportView(routerPanel);
                    ((RouterPanel)routerPanel).enableP2P(isP2P);
                    ((RouterPanel)routerPanel).enableCsma(isCsma);
                    ((RouterPanel)routerPanel).enableWifi(isWifi);
                    ((RouterPanel)routerPanel).enableTcp(isTcp);
                    ((RouterPanel)routerPanel).enableUdp(isUdp);
                                 
            }break;
        }
    }
    
}
