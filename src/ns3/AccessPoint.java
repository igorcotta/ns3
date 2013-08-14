/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
package ns3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author João
 *
public class AccessPoint extends Node {
    static int qtdeAccessPoint = 0;
    private JTable accessPointTable = new JTable();

    public AccessPoint() {
        MoverLabel mouseController = new MoverLabel();
        this.setLocation(qtdeAccessPoint*5,0);
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AccessPoint.png")));
        this.setSize(71,56);
        this.setId(qtdeAccessPoint);
        this.setNome("accessPoint_"+qtdeAccessPoint);
        //this.setTipo("AccessPoint");
        this.addMouseListener(mouseController);  
        this.addMouseMotionListener(mouseController);
        this.setVisible(true);
        AccessPoint.upQtdeAccessPoint();
        iniciaTable();
    }
    
    public static int getQtdeAccessPoint() {
        return qtdeAccessPoint;
    }

    public static void upQtdeAccessPoint() {
        AccessPoint.qtdeAccessPoint++;
    }
    @Override
    public void exibirPropriedades(JScrollPane scrollPane) {
        scrollPane.setViewportView(accessPointTable);
    }
    
    private void iniciaTable() {
        accessPointTable.setAutoCreateRowSorter(true);
        accessPointTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"AccessPoint",qtdeAccessPoint},
                {null, null},{null, null},{null, null},{null, null},{null, null},
                {null, null},{null, null},{null, null},{null, null},{null, null},
                {null, null},{null, null},{null, null},{null, null},{null, null},
                {null, null},{null, null},{null, null},{null, null}
            },
            new String [] {
                " ", " "
            }
        ));
        accessPointTable.setGridColor(new java.awt.Color(204, 204, 204));
        accessPointTable.setInheritsPopupMenu(true);
        accessPointTable.setRowHeight(20);
    }
      
}

*/