/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ns3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author joao
 */
public class Table extends AbstractTableModel {

    private final int COL_DEST = 0;
    private final int COL_GATEWAY = 1;
    private final int COL_GENMASK = 2;
    private final int COL_METRIC = 3;
    private final int COL_IFACE = 4;
    
    private List<Router> list;
    
    
    public Table() {
        list = new ArrayList<Router>();
    }
    
    public Table(List<Router> rl) {
        this();
        list.addAll(rl);
    }
    
    public int getRowCount() {
        //quantidade de linha
        return list.size();
    }

    public int getColumnCount() {
        //quantidade de colunas
        return 5;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        //retorna a classe que representa a coluna
        return String.class;
    }
    
    @Override
    public String getColumnName(int column) {
        //qual o nome da coluna
        if (column == COL_DEST) {
            return "Destination";
        } 
        else if (column == COL_GATEWAY) {
            return "Gateway";
        }
        else if (column == COL_GENMASK) {
            return "Genmask";
        }
        else if (column == COL_METRIC) {
            return "Metric";
        }
        else if (column == COL_IFACE) {
            return "Interface";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Router rl = list.get(rowIndex);

        //verifica qual valor deve ser retornado
        if (columnIndex == COL_DEST) {
            return rl.getDest();
        } 
        else if (columnIndex == COL_GATEWAY) {
            return rl.getGateway();
        }
        else if (columnIndex == COL_GENMASK) {
            return rl.getGenmask();
        }
        else if (columnIndex == COL_METRIC) {
            return rl.getMetric();
        }
        else if (columnIndex == COL_IFACE) {
            return rl.getIface();
        }

        return "";
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //pega o produto da linha
        Router rl = list.get(rowIndex);

        //verifica qual valor vai ser alterado
        if (columnIndex == COL_DEST) {
            rl.setDest(aValue.toString());
        } 
        else if (columnIndex == COL_GATEWAY) {
            rl.setGateway(aValue.toString());
        }
        else if (columnIndex == COL_GENMASK) {
            rl.setGenmask(aValue.toString());
        }
        else if (columnIndex == COL_METRIC) {
            rl.setMetric(aValue.toString());
        }
        else if (columnIndex == COL_IFACE) {
            rl.setIface(aValue.toString());
        }

        //avisa que os dados mudaram
        fireTableDataChanged();
    }

    public void inserir(Router rl) {
        list.add(rl);

        fireTableDataChanged();
    }

}
